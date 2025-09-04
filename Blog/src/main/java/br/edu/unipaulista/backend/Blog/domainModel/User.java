package br.edu.unipaulista.backend.Blog.domainModel;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private @Getter @Setter long id;
    private @Getter @Setter String name;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
    private @Getter @Setter List<Role> roles;
    private @Getter @Setter Profile profile;
}
