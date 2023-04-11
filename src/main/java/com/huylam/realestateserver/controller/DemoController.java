package com.huylam.realestateserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

  @GetMapping("/admin/api/v1/demo-controller")
  @PreAuthorize("hasAuthority('ADMIN')")
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello from secured endpoint");
  }

  @GetMapping("/user")
  @PreAuthorize("hasAuthority('USER')")
  public ResponseEntity<String> sayHelloUser() {
    return ResponseEntity.ok("Hello from secured endpoint user");
  }
}
