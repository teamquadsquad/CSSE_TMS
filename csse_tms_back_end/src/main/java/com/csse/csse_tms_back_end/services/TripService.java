package com.csse.csse_tms_back_end.services;

import com.csse.csse_tms_back_end.exceptions.TripIdException;
import com.csse.csse_tms_back_end.model.Trip;
import com.csse.csse_tms_back_end.repositories.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public Trip saveOrUpdateTrip(Trip trip) {

        try {
            trip.setNic(trip.getNic().toUpperCase());
            return tripRepository.save(trip);
        } catch (Exception e) {
            throw new TripIdException("Trip ID '" + trip.getId() + "' already exists");
        }
    }

    public Iterable<Trip> findAllTrips() {
        return tripRepository.findAll();
    }
}
