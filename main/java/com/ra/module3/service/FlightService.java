package com.ra.module3.service;

import com.ra.module3.model.entity.Flight;
import com.ra.module3.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;
  public   List<Flight> findAllWithPagination(int page, int size, String searchFlightName){
        return flightRepository.findAllWithPagination(page,size,searchFlightName);
    };
  public   Flight findById(int id){
        return flightRepository.findById(id);
    };
  public   boolean saveFlight(Flight flight){
        return flightRepository.saveFlight(flight);
    };
   public boolean deleteFlight(int id){
        return flightRepository.deleteFlight(id);
    };
   public long countFlightByFlightName(String searchFlightName){
        return flightRepository.countFlightByFlightName(searchFlightName);
    }
}
