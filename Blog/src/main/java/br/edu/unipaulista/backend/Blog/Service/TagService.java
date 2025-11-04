package br.edu.unipaulista.backend.Blog.Service;

import br.edu.unipaulista.backend.Blog.domainModel.Role;
import br.edu.unipaulista.backend.Blog.domainModel.Tag;

import java.util.List;
import java.util.UUID;

public interface TagService {
    List<Tag> findAll();

    Tag findById(UUID id);

    void deleteById(UUID id);

    Tag create(Tag tag);

    Tag update(Tag tag);

    Tag partialUpdate(Tag tag);

}
