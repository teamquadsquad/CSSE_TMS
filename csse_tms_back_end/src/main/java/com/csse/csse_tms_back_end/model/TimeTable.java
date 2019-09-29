package com.csse.csse_tms_back_end.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.Date;

@Entity
public class TimeTable {

    @Id
    @Column(updatable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date date;

    @NotBlank(message = "Route Number is required")
    private int route_no;

    @NotBlank(message = "Route name is required")
    private String route_name;

    @Size(min=4, max=5, message = "Please use 4 to 5 characters")
    @NotBlank(message = "Starting Point is required")
    private String start_from;

    @JsonFormat(pattern = "00:00")
    @NotBlank(message = "Departure Time is required")
    private Time departure_time;

    @JsonFormat(pattern = "00:00")
    @NotBlank(message = "Arrival Time is required")
    private Time arrival_time;

    @NotBlank(message = "Vehicle Number is required")
    private String vehicle_no;

    public TimeTable() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRoute_no() {
        return route_no;
    }

    public void setRoute_no(int route_no) {
        this.route_no = route_no;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name;
    }

    public String getStart_from() {
        return start_from;
    }

    public void setStart_from(String start_from) {
        this.start_from = start_from;
    }

    public Time getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Time departure_time) {
        this.departure_time = departure_time;
    }

    public Time getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(Time arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getVehicle_no() {
        return vehicle_no;
    }

    public void setVehicle_no(String vehicle_no) {
        this.vehicle_no = vehicle_no;
    }
}
