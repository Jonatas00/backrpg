package com.github.prototipo_rpg.backrpg.repositories;

import com.github.prototipo_rpg.backrpg.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
