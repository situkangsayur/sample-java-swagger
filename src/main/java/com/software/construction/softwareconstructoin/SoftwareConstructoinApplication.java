package com.software.construction.softwareconstructoin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class SoftwareConstructoinApplication {

  public static void main(String[] args) {
    SpringApplication.run(SoftwareConstructoinApplication.class, args);
  }

}
