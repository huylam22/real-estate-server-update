package com.huylam.realestateserver.entity.user;

import static com.huylam.realestateserver.entity.user.Permission.*;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@RequiredArgsConstructor
public enum Role {
  USER(Set.of(USER_READ, USER_CREATE, USER_UPDATE, USER_DELETE)),
  ADMIN(
    Set.of(
      ADMIN_READ,
      ADMIN_UPDATE,
      ADMIN_DELETE,
      ADMIN_CREATE,
      MANAGER_READ,
      MANAGER_UPDATE,
      MANAGER_DELETE,
      MANAGER_CREATE
    )
  ),
  MANAGER(Set.of(MANAGER_READ, MANAGER_UPDATE, MANAGER_DELETE, MANAGER_CREATE));

  @Getter
  private final Set<Permission> permissions;

  public List<SimpleGrantedAuthority> getAuthorities() {
    var authorities = getPermissions()
      .stream()
      .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
      .collect(Collectors.toList());
    authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
    return authorities;
  }
}
