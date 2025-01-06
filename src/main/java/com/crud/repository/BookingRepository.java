package com.crud.repository;

import com.crud.entity.Booking;

import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    Optional<Booking> findById(SingularAttribute<AbstractPersistable, Serializable> id);
}
