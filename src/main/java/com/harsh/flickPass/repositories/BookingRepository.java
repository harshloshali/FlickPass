package com.harsh.flickPass.repositories;

import com.harsh.flickPass.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    @Override
    Booking save(Booking booking);
}
