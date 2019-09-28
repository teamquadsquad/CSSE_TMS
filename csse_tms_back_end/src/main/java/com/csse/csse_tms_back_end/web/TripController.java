package com.csse.csse_tms_back_end.web;

import com.csse.csse_tms_back_end.model.Trip;
import com.csse.csse_tms_back_end.services.MapValidationErrorService;
import com.csse.csse_tms_back_end.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/trips")
public class TripController {
    @Autowired
    private TripService tripService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewTrip(@Valid @RequestBody Trip trip, BindingResult result) {

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if (errorMap != null) return errorMap;

        Trip tripObj = tripService.saveOrUpdateTrip(trip);
        return new ResponseEntity<Trip>(tripObj, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Trip> getAllTrips() {
        return tripService.findAllTrips();
    }
}
