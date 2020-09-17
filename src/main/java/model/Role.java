package model;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Role {

    private UUID id;
    private String name;

    public Role() {
    }

    public Role(UUID id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Role{"
                + "id=" + id
                + ", name='" + name + '\''
                + '}';
    }
}
