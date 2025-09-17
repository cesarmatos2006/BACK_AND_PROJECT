package br.edu.unipaulista.backend.Blog.domainModel;

import lombok.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private @Getter @Setter UUID id;
    private @Getter @Setter String name;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
    private @Getter @Setter List<Role> roles;
    private @Getter @Setter Profile profile;
}
