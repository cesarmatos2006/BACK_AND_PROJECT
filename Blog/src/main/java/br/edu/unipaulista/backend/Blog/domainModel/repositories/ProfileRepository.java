package br.edu.unipaulista.backend.Blog.domainModel.repositories;

import br.edu.unipaulista.backend.Blog.domainModel.Post;
import br.edu.unipaulista.backend.Blog.domainModel.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    List<Profile> findAll();

    Profile findById(UUID id);

    Profile deleteById(UUID id);

    Profile save(Profile profile);
}
