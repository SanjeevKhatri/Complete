package edu.apigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Sanjeev");
    }

}
