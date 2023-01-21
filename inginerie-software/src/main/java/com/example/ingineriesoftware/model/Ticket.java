package com.example.ingineriesoftware.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ticket")
public class Ticket extends AbstactEntity{

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDetails user;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    public Ticket(UserDetails user, Train train) {
        this.user = user;
        this.train = train;
    }

    public Ticket() {

    }

    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(user, ticket.user) && Objects.equals(train, ticket.train);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, train);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "user=" + user +
                ", train=" + train +
                '}';
    }
}
