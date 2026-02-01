package com.sriansantos.workshopmongo.resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import com.sriansantos.workshopmongo.domain.User;

import scorex.util.ArrayList;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "Maria Silva", "maria@gmail.com");
        User alex = new User ("2", "Alex Carlos", "alexpoatan@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
    }


}
