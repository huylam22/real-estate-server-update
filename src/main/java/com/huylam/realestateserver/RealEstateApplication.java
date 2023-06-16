package com.huylam.realestateserver;

import com.huylam.realestateserver.auth.RegisterRequest;
import com.huylam.realestateserver.entity.user.Role;
import com.huylam.realestateserver.service.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RealEstateApplication {

  public static void main(String[] args) {
    SpringApplication.run(RealEstateApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(AuthenticationService service) {
    return args -> {
      var admin = RegisterRequest
        .builder()
        .firstname("Admin")
        .lastname("Admin")
        .email("admin@gmail.com")
        .password("123456")
        .role(Role.ADMIN)
        .build();
      System.out.println(
        "ADMIN Token: " + service.register(admin).getAccessToken()
      );

      var manager = RegisterRequest
        .builder()
        .firstname("Manager")
        .lastname("Manager")
        .email("manager@gmail.com")
        .password("123456")
        .role(Role.MANAGER)
        .build();
      System.out.println(
        "MANAGER Token: " + service.register(manager).getAccessToken()
      );
    };
  }
}
