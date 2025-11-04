package br.edu.unipaulista.backend.Blog.Service;


import br.edu.unipaulista.backend.Blog.domainModel.Tag;
import br.edu.unipaulista.backend.Blog.domainModel.repositories.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;

    @Override
    public List<Tag> findAll() {
        return this.tagRepository.findAll();
    }

    @Override
    public Tag findById(UUID id) {
        return this.tagRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {
        this.tagRepository.deleteById(id);
    }

    @Override
    public Tag create(Tag tag) {
        return this.tagRepository.save(tag);
    }

    @Override
    public Tag update(Tag tag) {
        return this.tagRepository.save(tag);
    }

    @Override
    public Tag partialUpdate(Tag tag) {
        return this.tagRepository.save(tag);
    }

}
