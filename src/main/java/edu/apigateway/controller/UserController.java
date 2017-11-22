package edu.apigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/test")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Sanjeev Khatri");
    }
}
