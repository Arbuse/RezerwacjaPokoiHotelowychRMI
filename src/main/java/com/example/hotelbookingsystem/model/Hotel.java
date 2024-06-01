package com.example.hotelbookingsystem.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "hotels")
public class Hotel implements Serializable {
    private long hotelId;
    private long availableRoomsCount;
    private String hotelName;
    private String rating;
    private String location;

    private List<Room> roomList;

    public Hotel(long hotelId, long availableRoomsCount, String hotelName, String rating, String location) {
        this.hotelId = hotelId;
        this.availableRoomsCount = availableRoomsCount;
        this.hotelName = hotelName;
        this.rating = rating;
        this.location = location;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public long getAvailableRoomsCount() {
        return availableRoomsCount;
    }

    public void setAvailableRoomsCount(long availableRoomsCount) {
        this.availableRoomsCount = availableRoomsCount;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public boolean setRoomList(Room room) {
        return roomList.add(room);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", availableRoomsCount=" + availableRoomsCount +
                ", hotelName='" + hotelName + '\'' +
                ", rating='" + rating + '\'' +
                ", location='" + location + '\'' +
                ", roomList=" + roomList +
                '}';
    }
}
