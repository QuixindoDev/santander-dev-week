package com.quixindo.controller;

import com.quixindo.domain.model.Users;
import com.quixindo.service.IUserServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {
    private final IUserServiceController userService;

    public UserController(IUserServiceController userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping
    public ResponseEntity<Users> findById(@RequestBody Users userToCreate){
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }




}
