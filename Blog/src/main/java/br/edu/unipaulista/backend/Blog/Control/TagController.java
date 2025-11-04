package br.edu.unipaulista.backend.Blog.Control;

import br.edu.unipaulista.backend.Blog.Service.TagService;
import br.edu.unipaulista.backend.Blog.domainModel.Role;
import br.edu.unipaulista.backend.Blog.domainModel.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    @GetMapping
    public ResponseEntity<List<Tag>> findAll() {
        return ResponseEntity.ok(this.tagService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tag> findTagId(@RequestParam UUID id) {
        return ResponseEntity.ok(this.tagService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTag(@RequestParam UUID id) {
        this.tagService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Tag> createTag(@RequestBody Tag tag) {
        return new  ResponseEntity<>(this.tagService.create(tag), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Tag> updateTag(@RequestBody Tag tag) {
        return new ResponseEntity<>(this.tagService.update(tag), HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<Tag> patchTag(@RequestBody Tag tag) {
        return new ResponseEntity<>(this.tagService.partialUpdate(tag), HttpStatus.CREATED);
    }
}
