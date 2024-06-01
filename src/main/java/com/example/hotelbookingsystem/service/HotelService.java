package com.example.hotelbookingsystem.service;

import com.example.hotelbookingsystem.model.Hotel;
import com.example.hotelbookingsystem.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public void deleteHotel(long id) {
        hotelRepository.deleteById(id);
    }

    public Optional<Hotel> getHotelById(long id) {
        return hotelRepository.findById(id);
    }

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
