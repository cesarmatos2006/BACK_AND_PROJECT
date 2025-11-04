package br.edu.unipaulista.backend.Blog.Control;

import br.edu.unipaulista.backend.Blog.Service.RoleService;
import br.edu.unipaulista.backend.Blog.domainModel.Role;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> findAll() {
        return ResponseEntity.ok(this.roleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Role> findByRoleId(@RequestParam UUID id) {
        return ResponseEntity.ok(this.roleService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteByRoleId(@RequestParam UUID id) {
        this.roleService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        return new ResponseEntity<>(this.roleService.create(role), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Role> updateRole(@RequestBody Role role) {
        return new ResponseEntity<>(this.roleService.update(role), HttpStatus.CREATED);
    }

    @PatchMapping
    public ResponseEntity<Role> patchRole(@RequestBody Role role) {
        return new ResponseEntity<>(this.roleService.partialUpdate(role),  HttpStatus.CREATED);
    }
}
