package com.github.prototipo_rpg.backrpg.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @GetMapping("/teste")
  public ResponseEntity<String> getTestData() {
    String phrase = "Hello World";
    return ResponseEntity.status(401).body(phrase);
  }

  @PostMapping("/register")
  public ResponseEntity<String> saveTestData(@RequestBody String name) {
    if (name.equals("videiras")) {
      return ResponseEntity.status(200).body("Olá " + name + " , tudo bem?");
    } else {
      return ResponseEntity.status(401).body("Você não é o videiras!!!!");
    }
  }
}
