package br.edu.unipaulista.backend.Blog.Service;

import br.edu.unipaulista.backend.Blog.domainModel.Role;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    List<Role> findAll();

    Role findById(UUID id);

    void deleteById(UUID id);

    Role create(Role role);

    Role update(Role role);

    Role partialUpdate(Role role);
}
