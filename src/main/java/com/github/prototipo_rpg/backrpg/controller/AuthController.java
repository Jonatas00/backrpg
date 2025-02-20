package com.github.prototipo_rpg.backrpg.controller;

import com.github.prototipo_rpg.backrpg.entities.user.LoginDTO;
import com.github.prototipo_rpg.backrpg.entities.user.RegisterDTO;
import com.github.prototipo_rpg.backrpg.entities.user.User;
import com.github.prototipo_rpg.backrpg.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthController {

  private final UserService userService;

  public AuthController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {

    return ResponseEntity.ok().body(loginDTO);
  }

  @PostMapping("/register")
  public ResponseEntity<?> register(@RequestBody RegisterDTO registerDTO) {
    User user = userService.registerUser(registerDTO);

    return ResponseEntity.status(201).body(user);
  }
}
