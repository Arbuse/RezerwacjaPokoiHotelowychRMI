package com.example.hotelbookingsystem.service;

import com.example.hotelbookingsystem.model.Room;
import com.example.hotelbookingsystem.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public Room addRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Room room) {
        return roomRepository.save(room);
    }

    public void deleteRoom(long id) {
        roomRepository.deleteById(id);
    }

    public Optional<Room> getRoomById(long id) {
        return roomRepository.findById(id);
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public boolean checkRoomAvailable(long id) {
        Optional<Room> room = roomRepository.findById(id);
        return room.map(Room::isActive).orElse(false);
    }
}
