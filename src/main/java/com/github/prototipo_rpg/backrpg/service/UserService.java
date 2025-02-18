package com.github.prototipo_rpg.backrpg.service;

import com.github.prototipo_rpg.backrpg.entities.User;
import com.github.prototipo_rpg.backrpg.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

  public User addUser(User user) {
    return userRepository.save(user);
  }

  public Optional<User> deleteUser(long id) {
    Optional<User> deletedUser = userRepository.findById(id);

    if (deletedUser.isPresent()) {
      userRepository.deleteById(id);
    }
    return deletedUser;
  }
}
