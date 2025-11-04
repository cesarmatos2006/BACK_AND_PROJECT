package br.edu.unipaulista.backend.Blog.Service;

import br.edu.unipaulista.backend.Blog.domainModel.Role;
import br.edu.unipaulista.backend.Blog.domainModel.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    public final RoleRepository repository;

    @Override
    public List<Role> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Role findById(UUID id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
         this.repository.deleteById(id);
    }

    @Override
    public Role create(Role role) {
        return this.repository.save(role);
    }

    @Override
    public Role update(Role role) {
        return this.repository.save(role);
    }

    @Override
    public Role partialUpdate(Role role) {
        return this.repository.save(role);
    }
}
