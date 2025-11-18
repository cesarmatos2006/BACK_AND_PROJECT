/*
package br.edu.unipaulista.backend.Blog.dtos;

import br.edu.unipaulista.backend.Blog.domainModel.Profile;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProfileDTO{
    private UUID id;

    @NotBlank(message = "Bio obrigatória")
    @Size(max = 100)
    private String bio;

    @NotBlank(message = "Url da foto obrigatória")
    @Size(max = 100)
    private String pictureUrl;

    public static ProfileDTO fromEntity(Profile profile){
        if(profile == null){
            return null;
        }
        ProfileDTO dto = new ProfileDTO();
        dto.setId(profile.getId());
        dto.setBio(profile.getBio());
        dto.setPictureUrl(profile.getPictureUrl());
        return dto;
    }

    public static Profile fromDTO(ProfileDTO dto){
        if(dto == null){
            return null;
        }
        Profile profile = new Profile();
        profile.setId(dto.getId());
        profile.setBio(dto.getBio());
        profile.setPictureUrl(dto.getPictureUrl());
        return profile;
    }
}
