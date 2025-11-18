/*
package br.edu.unipaulista.backend.Blog.dtos;

import br.edu.unipaulista.backend.Blog.domainModel.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class RoleDTO {
    private UUID id;

    @NotBlank(message = "O nome é obrigatorio")
    @Size(max = 100)
    private String name;

    public static RoleDTO toDto(Role role) {
        if (role == null) {
            return null;
        }
        RoleDTO dto = new RoleDTO();
        dto.setId(role.getId());
        dto.setName(role.getName());
        return dto;
    }

    public static Role toEntity(RoleDTO dto) {
        if (dto == null) {
            return null;
        }
        Role role = new Role();
        role.setId(dto.getId());
        role.setName(dto.getName());
        return role;
    }
}
