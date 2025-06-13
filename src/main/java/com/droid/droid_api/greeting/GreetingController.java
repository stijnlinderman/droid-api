package com.droid.droid_api.greeting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok().build();
    }
}
