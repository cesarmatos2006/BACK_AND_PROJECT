package br.edu.unipaulista.backend.Blog.Control;

import br.edu.unipaulista.backend.Blog.Service.UserService;
import br.edu.unipaulista.backend.Blog.domainModel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//http://localhost:8080/users
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> findAll() {
        return this.userService.findAll();
    }

    // GET http://localhost:8080/user/{id}
    @GetMapping("/{id}")
    public User findUserById(@PathVariable UUID id) {
        return this.userService.findById(id);
    }

    // DELETE http://localhost:8080/user/{id}
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable UUID id) {
        this.userService.deleteById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return this.userService.create(user);
    }
}
