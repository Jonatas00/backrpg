package com.github.prototipo_rpg.backrpg.repository;

import com.github.prototipo_rpg.backrpg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
