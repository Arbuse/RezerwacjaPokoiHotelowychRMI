package com.example.hotelbookingsystem.controllers;

import com.example.hotelbookingsystem.model.Room;
import com.example.hotelbookingsystem.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping
    public ResponseEntity<Room> addRoom(@RequestBody Room room) {
        Room newRoom = roomService.addRoom(room);
        return ResponseEntity.ok(newRoom);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable long id, @RequestBody Room roomDetails) {
        Optional<Room> optionalRoom = roomService.getRoomById(id);
        if (optionalRoom.isPresent()) {
            Room room = optionalRoom.get();
            room.setHotelId(roomDetails.getHotelId());
            room.setMaxPeopleInTheRoom(roomDetails.getMaxPeopleInTheRoom());
            room.setActive(roomDetails.isActive());
            room.setReservationDate(roomDetails.getReservationDate());
            room.setOpenDate(roomDetails.getOpenDate());
            room.setRoomEquipment(roomDetails.getRoomEquipment());
            Room updatedRoom = roomService.updateRoom(room);
            return ResponseEntity.ok(updatedRoom);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable long id) {
        roomService.deleteRoom(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable long id) {
        Optional<Room> room = roomService.getRoomById(id);
        return room.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms = roomService.getAllRooms();
        return ResponseEntity.ok(rooms);
    }

    @GetMapping("/checkAvailability/{id}")
    public ResponseEntity<Boolean> checkRoomAvailable(@PathVariable long id) {
        boolean isAvailable = roomService.checkRoomAvailable(id);
        return ResponseEntity.ok(isAvailable);
    }
}
