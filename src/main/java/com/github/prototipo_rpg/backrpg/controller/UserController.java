package com.github.prototipo_rpg.backrpg.controller;

import com.github.prototipo_rpg.backrpg.entities.User;
import com.github.prototipo_rpg.backrpg.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/users")
@RestController
@AllArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public ResponseEntity<List<User>> getUsers() {
    List<User> users = userService.getUsers();

    return ResponseEntity.status(200).body(users);
  }

  @PostMapping
  public ResponseEntity<User> addUser(@RequestBody User user) {
    User savedUser = userService.addUser(user);

    return ResponseEntity.status(201).body(savedUser);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteUser(@PathVariable Long id) {
    Optional<User> deletedUser = userService.deleteUser(id);

    return ResponseEntity.status(200).body(deletedUser);
  }
}
