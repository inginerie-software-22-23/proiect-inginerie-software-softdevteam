package com.example.ingineriesoftware.model;


import javax.persistence.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "train")
public class Train extends AbstactEntity {
    private String name;
    private int numOfSeats;
    private Date departureTime;
    private Date arrivalTime;

    @OneToMany(mappedBy = "train")
    private List<Ticket> tickets;

    public Train(String name, int numOfSeats, Date departureTime, Date arrivalTime) {
        this.name = name;
        this.numOfSeats = numOfSeats;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Train() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return numOfSeats == train.numOfSeats && Objects.equals(name, train.name) && Objects.equals(departureTime, train.departureTime) && Objects.equals(arrivalTime, train.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfSeats, departureTime, arrivalTime);
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", numOfSeats=" + numOfSeats +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
