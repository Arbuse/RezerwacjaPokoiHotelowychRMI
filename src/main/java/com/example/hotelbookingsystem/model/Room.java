package com.example.hotelbookingsystem.model;

import com.example.hotelbookingsystem.enums.EQUIPMENT;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "rooms")
public class Room implements Serializable {
    private long hotelId;
    private long maxPeopleInTheRoom;
    private boolean active;
    private Date reservationDate;
    private Date openDate;

    private EQUIPMENT roomEquipment;

    public Room(long hotelId, long maxPeopleInTheRoom, boolean active, Date reservationDate, Date openDate, EQUIPMENT roomEquipment) {
        this.hotelId = hotelId;
        this.maxPeopleInTheRoom = maxPeopleInTheRoom;
        this.active = active;
        this.reservationDate = reservationDate;
        this.openDate = openDate;
        this.roomEquipment = roomEquipment;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public long getMaxPeopleInTheRoom() {
        return maxPeopleInTheRoom;
    }

    public void setMaxPeopleInTheRoom(long maxPeopleInTheRoom) {
        this.maxPeopleInTheRoom = maxPeopleInTheRoom;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public EQUIPMENT getRoomEquipment() {
        return roomEquipment;
    }

    public void setRoomEquipment(EQUIPMENT roomEquipment) {
        this.roomEquipment = roomEquipment;
    }

    @Override
    public String toString() {
        return "Room{" +
                "hotelId=" + hotelId +
                ", maxPeopleInTheRoom=" + maxPeopleInTheRoom +
                ", active=" + active +
                ", reservationDate=" + reservationDate +
                ", openDate=" + openDate +
                ", roomEquipment=" + roomEquipment +
                '}';
    }
}
