/*
package br.edu.unipaulista.backend.Blog.dtos;

import br.edu.unipaulista.backend.Blog.domainModel.Tag;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class TagDTO {
    private UUID id;

    @NotBlank(message = "Nome obrigatorio")
    @Size(max = 100)
    private String name;

    public static TagDTO toDTO(Tag tag) {
        if (tag == null) {
            return null;
        }
        TagDTO dto = new TagDTO();
        dto.setId(tag.getId());
        dto.setName(tag.getName());
        return dto;
    }

    public static Tag toEntity(TagDTO dto) {
        if (dto == null) {
            return null;
        }
        Tag tag = new Tag();
        tag.setId(dto.getId());
        tag.setName(dto.getName());
        return tag;
    }
}
