package com.github.prototipo_rpg.backrpg.repository;


import com.github.prototipo_rpg.backrpg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
