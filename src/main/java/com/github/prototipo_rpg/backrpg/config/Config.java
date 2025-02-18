package com.github.prototipo_rpg.backrpg.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  public Config() throws Exception {
    loadConfigs();
  }

  private void loadConfigs() throws Exception {
    System.out.println("Loading config...");
  }
}
