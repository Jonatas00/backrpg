package com.github.prototipo_rpg.backrpg.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name = "tb_user")
@Entity
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private String name;
  @Column(name = "hash_password", nullable = false)
  private String hashPassword;
  @Column(unique = true, nullable = false)
  private String email;
  @CreationTimestamp
  @Column(name = "created_at")
  private LocalDateTime createdAt;
}
