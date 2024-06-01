package com.example.hotelbookingsystem;

import com.example.hotelbookingsystem.model.Hotel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/test")
public class API {

    @GetMapping("/list_of_rooms")
    public String listOfRooms() {
        return "List of Rooms";
    }

}
