/*
package br.edu.unipaulista.backend.Blog.dtos;

import br.edu.unipaulista.backend.Blog.domainModel.Post;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class PostDTO {
    private UUID id;

    @NotBlank(message = "Titulo obrigatório")
    @Size(max = 100)
    private String title;

    @NotBlank(message = "content obrigatório")
    @Size(max = 100)
    private String content;

    public static PostDTO fromEntity(Post post) {
        if (post == null) {
            return null;
        }
        PostDTO dto = new PostDTO();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        return dto;
    }

    public static Post toEntity(PostDTO dto) {
        if (dto == null) {
            return null;
        }
        Post post = new Post();
        post.setId(dto.getId());
        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());
        return post;
    }
}
