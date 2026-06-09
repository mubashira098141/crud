package com.crud.repository;

import com.crud.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
  // no need to redefine findById, JpaRepository already provides it
}
