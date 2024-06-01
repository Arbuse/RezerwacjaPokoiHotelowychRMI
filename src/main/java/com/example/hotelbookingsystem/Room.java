package com.example.hotelbookingsystem;

import com.example.hotelbookingsystem.enums.EQUIPMENT;

import java.util.Date;

public class Room {
    private long hotelId;
    private long maxPeopleInTheRoom;
    private boolean active;
    private Date reservationDate;
    private Date openDate;

    private EQUIPMENT roomEquipment;
}
