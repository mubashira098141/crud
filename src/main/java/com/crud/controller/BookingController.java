package com.crud.controller;

import com.crud.entity.Booking;
import com.crud.repository.BookingRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

  @Autowired private BookingRepository bookingRepository;

  // ✅ Create a booking
  @PostMapping
  public ResponseEntity<String> createBooking(@RequestBody Booking booking) {
    bookingRepository.save(booking);
    return ResponseEntity.ok("Booking created successfully! Booking ID: " + booking.getBookingId());
  }

  // ✅ Get a booking by ID
  @GetMapping("/{id}")
  public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
    Optional<Booking> booking = bookingRepository.findById(id);
    return booking.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  // getmapping by list
  @GetMapping()
  public ResponseEntity<List<Booking>> getAllBookings() {
    return ResponseEntity.ok(bookingRepository.findAll());
  }

  // ✅ Delete booking by ID
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteBooking(@PathVariable Long id) {
    bookingRepository.deleteById(id);
    return ResponseEntity.ok("Booking deleted successfully!");
  }
}
