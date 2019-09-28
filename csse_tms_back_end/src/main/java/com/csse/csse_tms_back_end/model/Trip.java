package com.csse.csse_tms_back_end.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "NIC is required")
    @Column(updatable = false, unique = true)
    private String nic;

    @NotBlank(message = "startedLocation is required")
    private String startedLocation;

    @Column(nullable = true, updatable = true)
    private String endedLocation;

    @Column(nullable = true, updatable = true)
    private String fare;

    private String date;

    public Trip() {
    }

    @PrePersist
    protected void onCreate() {
        this.date = getCurrentDate();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getStartedLocation() {
        return startedLocation;
    }

    public void setStartedLocation(String startedLocation) {
        this.startedLocation = startedLocation;
    }

    public String getEndedLocation() {
        return endedLocation;
    }

    public void setEndedLocation(String endedLocation) {
        this.endedLocation = endedLocation;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    private String getCurrentDate() {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateObj = new Date();
        return df.format(dateObj);
    }
}
