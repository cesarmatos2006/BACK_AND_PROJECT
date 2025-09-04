package br.edu.unipaulista.backend.Blog.Service;

import br.edu.unipaulista.backend.Blog.domainModel.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        return List.of();
    }
}
