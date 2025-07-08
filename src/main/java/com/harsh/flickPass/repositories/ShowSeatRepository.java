package com.harsh.flickPass.repositories;

import com.harsh.flickPass.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {
    @Override
    List<ShowSeat> findAllById(Iterable<Long> ids);

    @Override
    ShowSeat save(ShowSeat showSeat);
}
