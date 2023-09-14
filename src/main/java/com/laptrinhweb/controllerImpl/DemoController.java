package com.laptrinhweb.controllerImpl;

import com.laptrinhweb.entity.Role;
import com.laptrinhweb.entity.UserEntity;
import com.laptrinhweb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    UserRepo userRepo;
    @GetMapping("/login-success")
    public ResponseEntity<String> loginSuccess(){
        return ResponseEntity.ok("Success! ok nha");
    }
    @GetMapping("/add-user")
    public ResponseEntity<String> addUser(){
//        UserEntity user1 = new UserEntity(UUID.randomUUID().toString(),"tuyen","hoang","admin@gmai","$2a$12$QgXEzbrHVLNbs/31GKk0Pu5Gl.ry8WLSOdGZCjo6PzbUSFPo/DR.C","no","0123", Role.ROLE_ADMIN);
        UserEntity user2 = new UserEntity(UUID.randomUUID().toString(),"tuyen","hoang","user@gmai","$2a$12$QgXEzbrHVLNbs/31GKk0Pu5Gl.ry8WLSOdGZCjo6PzbUSFPo/DR.C","no","0123", Role.ROLE_USER);
        userRepo.save(user2);
//        userRepo.save(user1);
        return ResponseEntity.ok("Success! ok nha");
    }
}
