package br.edu.unipaulista.backend.Blog.domainModel.repositories;

import br.edu.unipaulista.backend.Blog.domainModel.Profile;

import java.util.List;
import java.util.UUID;

public interface ProfileRepository {
    List<Profile> findAll();

    Profile findById(UUID id);

    Profile deleteById(UUID id);

    Profile save(Profile profile);
}
