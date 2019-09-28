package com.csse.csse_tms_back_end.services;

import com.csse.csse_tms_back_end.model.Passenger;
import com.csse.csse_tms_back_end.exceptions.PassengerIdException;
import com.csse.csse_tms_back_end.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public Passenger saveOrUpdatePassenger(Passenger passenger){

        try{
            passenger.setNic(passenger.getNic().toUpperCase());
            return passengerRepository.save(passenger);
        }catch (Exception e){
            throw new PassengerIdException("Passenger ID '"+passenger.getNic().toUpperCase()+"' already exists");
        }
    }

    public Iterable<Passenger> findAllPassengers(){
        return passengerRepository.findAll();
    }
}
