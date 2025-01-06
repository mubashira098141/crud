package com.crud.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "hotel")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String hotelName;
    private LocalDate checkInDate;
    private Long guest;

    // Default constructor (required by JPA)
    public Booking() {}

    // Constructor for convenience
    public Booking(String hotelName, LocalDate checkInDate, Long guest) {
        this.hotelName = hotelName;
        this.checkInDate = checkInDate;
        this.guest = guest;
    }

    // Getter and setter for userId (Id field)
    public Long getUserId() {
        return userId;  // should return the actual userId value
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // Getter and setter for hotelName
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    // Getter and setter for checkInDate
    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    // Getter and setter for guest
    public Long getGuest() {
        return guest;
    }

    public void setGuest(Long guest) {
        this.guest = guest;
    }

//    // Optionally, you could add a toString() method for easier logging/printing
//    @Override
//    public String toString() {
//        return "Booking{" +
//                "userId=" + userId +
//                ", hotelName='" + hotelName + '\'' +
//                ", checkInDate=" + checkInDate +
//                ", guest=" + guest +
//                '}';
//    }

    // If BookingId is required, implement this method to return a unique identifier
    public String getBookingId() {
        return "BOOK-" + userId;  // Example of creating a BookingId from userId
    }
}
