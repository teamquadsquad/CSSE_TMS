package com.csse.csse_tms_back_end.repositories;

import com.csse.csse_tms_back_end.model.Passenger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {

    @Override
    Iterable<Passenger> findAll();
}
