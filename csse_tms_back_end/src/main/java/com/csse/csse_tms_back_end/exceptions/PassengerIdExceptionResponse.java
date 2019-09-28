package com.csse.csse_tms_back_end.exceptions;

public class PassengerIdExceptionResponse {

    private String passengernic;

    public PassengerIdExceptionResponse(String passengernic) {
        this.passengernic = passengernic;
    }

    public String getPassengernic() {
        return passengernic;
    }

    public void setPassengernic(String passengernic) {
        this.passengernic = passengernic;
    }
}
