package com.example.hotelbookingsystem.repositories;

import com.example.hotelbookingsystem.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room, Long> {
}