package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.UUID;

@Component
public class UserTransactions {
    private UUID id;
    private User user;
    private Item item;
    private Integer count;
    private BigDecimal price;
    private BigDecimal total;

    public UserTransactions() {
    }

    public UserTransactions(UUID id, User user, Item item, Integer count, BigDecimal price) {
        this.id = id;
        this.user = user;
        this.item = item;
        this.count = count;
        this.price = price;
        this.total = this.price.multiply(BigDecimal.valueOf(this.count));
    }

    @Override
    public String toString() {
        return "UserTransactions{"
                + "id=" + id
                + ", user=" + user
                + ", item=" + item
                + ", count=" + count
                + ", price=" + price
                + ", total=" + total
                + '}';
    }

    public UUID getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    @Autowired
    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}

