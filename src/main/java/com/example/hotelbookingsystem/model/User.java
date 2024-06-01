package com.example.hotelbookingsystem.model;

import com.example.hotelbookingsystem.enums.GRANTS;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;
@Data
@Document(collection = "users")
public class User implements Serializable {
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

}
