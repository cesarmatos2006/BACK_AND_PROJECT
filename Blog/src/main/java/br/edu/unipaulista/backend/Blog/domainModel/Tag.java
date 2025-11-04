package br.edu.unipaulista.backend.Blog.domainModel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)


    private @Getter @Setter UUID id;
    private @Getter @Setter String name;

    @ManyToMany(mappedBy = "tags")
    private @Getter @Setter Set<Post> post;

    public Tag orElse(Object o) {
        return null;
    }
}
