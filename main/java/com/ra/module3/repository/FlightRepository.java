package com.ra.module3.repository;

import com.ra.module3.model.dto.FlightDto;
import com.ra.module3.model.entity.Flight;

import java.util.List;

public interface FlightRepository {
    List<Flight>findAllWithPagination(int page,int size,String searchFlightName);
    Flight findById(int id);
    boolean saveFlight(Flight flight);
    boolean deleteFlight(int id);
    long countFlightByFlightName(String searchFlightName);
}
