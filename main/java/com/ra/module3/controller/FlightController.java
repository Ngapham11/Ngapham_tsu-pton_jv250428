package com.ra.module3.controller;

import com.ra.module3.model.dto.FlightDto;
import com.ra.module3.model.entity.Flight;
import com.ra.module3.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @GetMapping("")
    public String flightHome(@RequestParam(name = "page",defaultValue = "1")int page,
                             @RequestParam(name = "size",defaultValue = "4")int size,
                             @RequestParam(name = "searchFlightName",defaultValue = "")String searchFlightName,
                             Model model){
         int totalFlight=(int) flightService.countFlightByFlightName(searchFlightName);
         int totalPage=(int) Math.ceil((double) totalFlight/(double) size);
         model.addAttribute("page",page);
         model.addAttribute("totalPage",totalPage);
//         model.addAttribute("totalFlight",totalFlight);
         model.addAttribute("searchFlightName",searchFlightName);
        List<Flight>flights=flightService.findAllWithPagination(page, size, searchFlightName);
        model.addAttribute("flights",flights);
        return "flight_home";
    }
@GetMapping("/add")
    public String addFlight(Model model){
        model.addAttribute("flight",new FlightDto());
        return "add_flight";
}
@PostMapping("/add")
public String addFlight(@Valid @ModelAttribute("flight") FlightDto flight, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("flight",flight);
            return "add_flight";
        }

        flightService.saveFlight(flight);
        return "redirect:/";
}@GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("flight",flightService.findById(id));
        return "edit_flight";
    }
    @PostMapping("/edit/{id}")
    public String edit(@Valid @ModelAttribute("flight") FlightDto flight,BindingResult bindingResult,@PathVariable int id,
                       Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("flight",flight);
            return "edit_flight";
        }
        flight.setId(id);
        flightService.saveFlight(flight);
        return "redirect:/";
    }
}
