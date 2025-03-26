package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Location")
public class LocationController {
    @GetMapping
    public String getlocation(){
        return "manizales";
    }


}
