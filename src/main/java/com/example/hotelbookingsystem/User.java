package com.example.hotelbookingsystem;

import com.example.hotelbookingsystem.enums.GRANTS;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class User {
    private long id;

    private GRANTS permission;
    private String login;
    private String password;

    private List<Reservation> reservationList;

    public User(long id, GRANTS permission, String login, String password) {
        this.permission = permission;
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public GRANTS getPermission() {
        return permission;
    }

    public void setPermission(GRANTS permission) {
        this.permission = permission;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(Reservation reservation) {
        reservationList.add(reservation);
    }

    @Override
    public String toString() {
        return "User{" +
                "permission=" + permission +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", reservationList=" + reservationList +
                '}';
    }
}
