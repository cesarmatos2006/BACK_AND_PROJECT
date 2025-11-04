package br.edu.unipaulista.backend.Blog.domainModel.repositories;

import br.edu.unipaulista.backend.Blog.domainModel.Role;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleRepository  extends JpaRepository<Role, UUID> {
    List<Role> findAll();

    Optional<Role> findById(UUID id);

    void deleteById(UUID id);

    Role save(Role role);
}
