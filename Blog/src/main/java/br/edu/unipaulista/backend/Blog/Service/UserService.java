package br.edu.unipaulista.backend.Blog.Service;

import br.edu.unipaulista.backend.Blog.domainModel.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
