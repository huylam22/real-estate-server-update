package com.huylam.realestateserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealEstateApplication {

  public static void main(String[] args) {
    String javaHome = System.getenv("AWS_ACCESS_KEY_ID");
    System.out.println("JAVA_HOME: " + javaHome);
    SpringApplication.run(RealEstateApplication.class, args);
  }
  // for database later
  // @Bean
  // public ApplicationRunner mySecrets(AWSSecretsManager secretsManagerClient) {
  //   return args -> {
  //     String secretName = "prod/realestateapp";
  //     GetSecretValueRequest request = new GetSecretValueRequest()
  //       .withSecretId(secretName);
  //     GetSecretValueResult result = secretsManagerClient.getSecretValue(
  //       request
  //     );
  //     String secretValue = result.getSecretString();

  //     // Parse and process the secret value as needed
  //     JSONObject secretJson = new JSONObject(secretValue);
  //     String myFirstSecret = secretJson.getString("accessKeyId");
  //     String mySecondSecret = secretJson.getString("secretKey");

  //     // Set the extracted values as system properties
  //     System.setProperty("my-first-secret", myFirstSecret);
  //     System.setProperty("my-second-secret", mySecondSecret);

  //     // Print the retrieved secret values
  //     System.out.println("Retrieved secret values:");
  //     System.out.println("my-first-secret: " + myFirstSecret);
  //     System.out.println("my-second-secret: " + mySecondSecret);
  //   };
  // }
  // @Bean
  // public CommandLineRunner commandLineRunner(AuthenticationService service) {
  //   return args -> {
  //     var admin = RegisterRequest
  //       .builder()
  //       .firstname("Admin")
  //       .lastname("Admin")
  //       .email("admin@gmail.com")
  //       .password("123456")
  //       .role(Role.ADMIN)
  //       .build();
  //     System.out.println(
  //       "ADMIN Token: " + service.register(admin).getAccessToken()
  //     );

  //     var manager = RegisterRequest
  //       .builder()
  //       .firstname("Manager")
  //       .lastname("Manager")
  //       .email("manager@gmail.com")
  //       .password("123456")
  //       .role(Role.MANAGER)
  //       .build();
  //     System.out.println(
  //       "MANAGER Token: " + service.register(manager).getAccessToken()
  //     );
  //   };
  // }

}
