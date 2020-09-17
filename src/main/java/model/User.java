package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class User {
    private UUID id;
    private String name;
    private Role role;

    public User(UUID id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", role=" + role
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

    public Role getRole() {
        return role;
    }

    @Autowired
    public void setRole(Role role) {
        this.role = role;
    }
}
