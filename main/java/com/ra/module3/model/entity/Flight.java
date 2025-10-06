package com.ra.module3.model.entity;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "flight_list")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(length = 100)
    @NotBlank(message = "Khong duoc de trong")
    private  String flight_name;
    @NotBlank(message = "Khong duoc de trong")
   private String starting_point;
    @NotNull(message = "Khong duoc de trong")
    private int travel_time;
    @NotBlank(message = "Khong duoc de trong")
   private String destination;
    @NotNull(message = "Khong duoc de trong")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
   private LocalDate departure_date;
    @NotBlank(message = "Khong duoc de trong")
   private String time_unit;
    @NotBlank(message = "Khong duoc de trong")
   private String travel_image;
    private boolean status;

    public Flight() {
    }

    public Flight(int id, String flight_name, String starting_point, int travel_time, String destination, LocalDate departure_date, String time_unit, String travel_image, boolean status) {
        this.id = id;
        this.flight_name = flight_name;
        this.starting_point = starting_point;
        this.travel_time = travel_time;
        this.destination = destination;
        this.departure_date = departure_date;
        this.time_unit = time_unit;
        this.travel_image = travel_image;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public String getStarting_point() {
        return starting_point;
    }

    public void setStarting_point(String starting_point) {
        this.starting_point = starting_point;
    }

    public int getTravel_time() {
        return travel_time;
    }

    public void setTravel_time(int travel_time) {
        this.travel_time = travel_time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(LocalDate departure_date) {
        this.departure_date = departure_date;
    }

    public String getTime_unit() {
        return time_unit;
    }

    public void setTime_unit(String time_unit) {
        this.time_unit = time_unit;
    }

    public String getTravel_image() {
        return travel_image;
    }

    public void setTravel_image(String travel_image) {
        this.travel_image = travel_image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
