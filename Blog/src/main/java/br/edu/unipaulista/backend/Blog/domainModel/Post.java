package br.edu.unipaulista.backend.Blog.domainModel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private @Getter @Setter UUID id;
    private @Getter @Setter String title;
    private @Getter @Setter String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private @Getter @Setter User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "post_tag",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private @Getter @Setter Set<Tag> tags;

    public Post orElse(Object o) {
        return null;
    }
}
