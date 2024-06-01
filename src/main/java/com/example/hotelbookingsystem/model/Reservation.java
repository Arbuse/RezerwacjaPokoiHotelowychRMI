package com.example.hotelbookingsystem.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class Reservation implements Serializable {
    private List<String> dayList;

    public List<String> getDayList() {
        return dayList;
    }

    public void setDayList(String dayName) {
        dayList.add(dayName);
    }
}
