package com.example.hotelbookingsystem;

import com.example.hotelbookingsystem.enums.GRANTS;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MongoDBConfig {
    private final MongoTemplate mongoTemplate;

    public MongoDBConfig(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        User user1 = new User(1, GRANTS.USER, "user1", "user1234");

        mongoTemplate.insert(user1);

        List<User> all = mongoTemplate.findAll(User.class);

        System.out.println(all);
    }
}
