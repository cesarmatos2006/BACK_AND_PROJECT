package br.edu.unipaulista.backend.Blog.Service;

import br.edu.unipaulista.backend.Blog.domainModel.User;
import br.edu.unipaulista.backend.Blog.domainModel.repositories.NonPersistentUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UseServiceImpl implements UserService {

    private final NonPersistentUserRepository repository;

    @Override
    public List<User> findAll() {
        return this.repository.findAll();
    }
}
