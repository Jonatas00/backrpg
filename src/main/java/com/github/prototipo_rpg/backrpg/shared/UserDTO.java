package com.github.prototipo_rpg.backrpg.shared;

import java.time.LocalDateTime;

public record UserDTO(Long id, String name, String email, LocalDateTime createdAt) {
}
