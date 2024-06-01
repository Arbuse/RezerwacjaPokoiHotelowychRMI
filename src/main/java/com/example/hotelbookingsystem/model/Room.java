package com.example.hotelbookingsystem.model;

import com.example.hotelbookingsystem.enums.EQUIPMENT;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
@Data
@Document(collection = "rooms")
public class Room implements Serializable {
    private long hotelId;
    private long maxPeopleInTheRoom;
    private boolean active;
    private Date reservationDate;
    private Date openDate;

    private EQUIPMENT roomEquipment;

}
