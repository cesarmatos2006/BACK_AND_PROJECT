package br.edu.unipaulista.backend.Blog.domainModel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter UUID id;

    @Column(name = "NAME", nullable = false, length = 20)
    private @Getter @Setter String name;

    @ManyToMany(mappedBy = "roles")
    private @Getter @Setter Set<User> user;

    public Role orElse(Object o) {
    return null;
    }
}
