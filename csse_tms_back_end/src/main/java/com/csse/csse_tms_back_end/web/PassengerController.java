package com.csse.csse_tms_back_end.web;

import com.csse.csse_tms_back_end.model.Passenger;
import com.csse.csse_tms_back_end.services.MapValidationErrorService;
import com.csse.csse_tms_back_end.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewPassenger(@Valid @RequestBody Passenger passenger, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        Passenger passengerObj = passengerService.saveOrUpdatePassenger(passenger);
        return new ResponseEntity<Passenger>(passengerObj, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Passenger> getAllPassengers(){return passengerService.findAllPassengers();}
}
