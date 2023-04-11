package com.huylam.realestateserver.service.DTO;

import com.huylam.realestateserver.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

  private String username;
  private String email;
  private String firstName;
  private String lastName;

  public UserDTO(User user) {
    this.username = user.getUsername();
    this.email = user.getEmail();
    this.firstName = user.getFirstname();
    this.lastName = user.getLastname();
  }
}
