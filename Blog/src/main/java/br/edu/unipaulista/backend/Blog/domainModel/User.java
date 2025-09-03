package br.edu.unipaulista.backend.Blog.domainModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

public class User {
    @NoArgsConstructor
    @AllArgsConstructor
    private long id;
    private @Getter @Setter String name;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
    private @Getter @Setter List<Role> roles;
    private @Getter @Setter Profile profile;

    public User() {
    }

    public User(String name, long id, String email, String password, List<Role> roles, Profile profile) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.profile = profile;
    }
}
