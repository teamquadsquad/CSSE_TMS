package com.csse.csse_tms_back_end.exceptions;

public class TripIdExceptionResponse {
    private String tripID;

    public TripIdExceptionResponse(String tripID) {
        this.tripID = tripID;
    }

    public String getTripID() {
        return tripID;
    }

    public void setTripID(String tripID) {
        this.tripID = tripID;
    }
}

