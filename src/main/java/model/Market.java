package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Market {
    private UUID id;
    private String name;
    private User owner;

    public Market() {
    }

    public Market(UUID id, String name, User owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Market{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", owner=" + owner
                + '}';
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    @Autowired
    public void setOwner(User owner) {
        this.owner = owner;
    }
}
