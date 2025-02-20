package com.github.prototipo_rpg.backrpg.entities.roles;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_roles")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false, unique = true)
  private RoleName name;
}
