package br.edu.unipaulista.backend.Blog.infrastructure.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

@Component
public class JwtHelper {
    private final String SECRETE = "PASSWORD_CHAVE_SECRETA";
    private final int TOKEN_EXPIRATION_MS =  1000*60*60*24*2;

    public String generateToken(UserDetails userDatails) {
        return Jwts.builder()
                .setSubject(userDatails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_EXPIRATION_MS))
                .signWith(this.getSigningKey())
                .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(this.getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean isTokenExpired(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(this.getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getExpiration().before(new Date());
    }

    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(SECRETE.getBytes());
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }
}
