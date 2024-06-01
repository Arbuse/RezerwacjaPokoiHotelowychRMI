package com.example.hotelbookingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class HotelBookingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelBookingSystemApplication.class, args);
    }
}
