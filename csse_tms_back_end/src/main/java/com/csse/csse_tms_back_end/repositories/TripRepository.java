package com.csse.csse_tms_back_end.repositories;

import com.csse.csse_tms_back_end.model.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {

    @Override
    Iterable<Trip> findAll();
}
