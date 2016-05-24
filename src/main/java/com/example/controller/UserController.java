package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/api/")
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<?> login() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<?> user(Principal user) {
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
