package com.example.hotelbookingsystem.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;
@Data
@Document(collection = "hotels")
public class Hotel implements Serializable {
    private long hotelId;
    private long availableRoomsCount;
    private String hotelName;
    private String rating;
    private String location;
    private List<Room> roomList;

}
