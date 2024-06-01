package com.example.hotelbookingsystem.controllers;

import com.example.hotelbookingsystem.model.Hotel;
import com.example.hotelbookingsystem.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
        Hotel newHotel = hotelService.addHotel(hotel);
        return ResponseEntity.ok(newHotel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable long id, @RequestBody Hotel hotelDetails) {
        Optional<Hotel> optionalHotel = hotelService.getHotelById(id);
        if (optionalHotel.isPresent()) {
            Hotel hotel = optionalHotel.get();
            hotel.setHotelId(hotelDetails.getHotelId());
            hotel.setAvailableRoomsCount(hotelDetails.getAvailableRoomsCount());
            hotel.setHotelName(hotelDetails.getHotelName());
            hotel.setRating(hotelDetails.getRating());
            hotel.setLocation(hotelDetails.getLocation());
            hotel.setRoomList(hotelDetails.getRoomList());
            Hotel updatedHotel = hotelService.updateHotel(hotel);
            return ResponseEntity.ok(updatedHotel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable long id) {
        hotelService.deleteHotel(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable long id) {
        Optional<Hotel> hotel = hotelService.getHotelById(id);
        return hotel.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotels = hotelService.getAllHotels();
        return ResponseEntity.ok(hotels);
    }
}
