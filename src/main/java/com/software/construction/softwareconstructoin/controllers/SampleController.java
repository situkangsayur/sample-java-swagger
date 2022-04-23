package com.software.construction.softwareconstructoin.controllers;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class SampleController {

  @GetMapping("/")
  public ResponseEntity<String> getMessage() {
    return new ResponseEntity("Hello World", HttpStatus.ACCEPTED);
  }

  @PostMapping("/data/")
  public ResponseEntity<HashMap<String, String>> postMessage(@RequestParam String message) {

    HashMap<String, String> data = new HashMap();
    data.put("message", message);

    return new ResponseEntity<HashMap<String, String>>(data, HttpStatus.ACCEPTED);
  }

}
