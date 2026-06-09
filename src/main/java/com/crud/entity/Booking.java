package com.crud.entity;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "hotel")
public class Booking {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long bookingId;

  private String hotelName;
  private LocalDate checkInDate;
  private Long guest;

  // Default constructor
  public Booking() {}

  // Constructor for convenience
  public Booking(String hotelName, LocalDate checkInDate, Long guest) {
    this.hotelName = hotelName;
    this.checkInDate = checkInDate;
    this.guest = guest;
  }

  // Getter and Setter for bookingId
  public Long getBookingId() {
    return bookingId;
  }

  public void setBookingId(Long bookingId) {
    this.bookingId = bookingId;
  }

  // Getter and Setter for hotelName
  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  // Getter and Setter for checkInDate
  public LocalDate getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
  }

  // Getter and Setter for guest
  public Long getGuest() {
    return guest;
  }

  public void setGuest(Long guest) {
    this.guest = guest;
  }

  // Custom method for string representation of bookingId
  public String getBookingIdString() {
    return "BOOK-" + bookingId;
  }

  // Optional: toString() method for logging/debugging
  @Override
  public String toString() {
    return "Booking{"
        + "bookingId="
        + bookingId
        + ", hotelName='"
        + hotelName
        + '\''
        + ", checkInDate="
        + checkInDate
        + ", guest="
        + guest
        + '}';
  }
}
