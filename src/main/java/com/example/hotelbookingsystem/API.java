package com.example.hotelbookingsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    @GetMapping("/list_of_rooms")
    public String listOfRooms() {
        return "List of Rooms";
    }
}
