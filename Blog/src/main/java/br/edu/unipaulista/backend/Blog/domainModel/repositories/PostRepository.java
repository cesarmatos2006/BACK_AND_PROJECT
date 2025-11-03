package br.edu.unipaulista.backend.Blog.domainModel.repositories;

import br.edu.unipaulista.backend.Blog.domainModel.Post;

import java.util.List;
import java.util.UUID;

public interface PostRepository {
    Post findById(UUID id);

    List<Post> findAll();

    Post deleteById(UUID id);

    Post save(Post post);
}
