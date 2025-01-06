package com.crud.controller;

import com.crud.entity.Booking;
import com.crud.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/Bookings")
public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;
    //book a hotel
    @PostMapping
    public ResponseEntity<String>createBooking(@RequestBody Booking booking){
     bookingRepository.save(booking);
     return ResponseEntity.ok("booking is created successfully! Booking ID:"+booking.getBookingId());

    }
    @GetMapping("/{userId}")
    public <userId> ResponseEntity<?>getBookingById(@PathVariable userId) {
        ResponseEntity<?> result;
        Optional<Booking> booking = bookingRepository.findById(id);
        if (booking.isPresent()) {
            result = ResponseEntity.ok(booking.get());
        } else {
            result = ResponseEntity.badRequest().body("booking not found");


        }
        return result;
    }}