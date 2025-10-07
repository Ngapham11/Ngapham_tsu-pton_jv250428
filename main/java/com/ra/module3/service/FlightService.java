package com.ra.module3.service;

import com.ra.module3.model.dto.FlightDto;
import com.ra.module3.model.entity.Flight;
import com.ra.module3.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightService {
    @Autowired
    private UploadFileService uploadFileService;
    @Autowired
    private FlightRepository flightRepository;
  public   List<Flight> findAllWithPagination(int page, int size, String searchFlightName){
        return flightRepository.findAllWithPagination(page,size,searchFlightName);
    };
  public   Flight findById(int id){
        return flightRepository.findById(id);
    };
  public   boolean saveFlight(FlightDto flight){
      Flight newFlight=new Flight();
      newFlight.setId(flight.getId());
      newFlight.setFlight_name(flight.getFlight_name());
      newFlight.setDestination(flight.getDestination());
      newFlight.setStatus(flight.isStatus());
      newFlight.setDeparture_date(flight.getDeparture_date());
      newFlight.setStarting_point(flight.getStarting_point());
      newFlight.setTime_unit(flight.getTime_unit());
      newFlight.setTravel_time(flight.getTravel_time());
      String imageUrl = uploadFileService.uploadFile(flight.getTravel_image());
      if (imageUrl != null && !imageUrl.isEmpty()) {
         newFlight.setTravel_image(imageUrl);
      } return flightRepository.saveFlight(newFlight);
    };
   public boolean deleteFlight(int id){
        return flightRepository.deleteFlight(id);
    };
   public long countFlightByFlightName(String searchFlightName){
        return flightRepository.countFlightByFlightName(searchFlightName);
    }
}
