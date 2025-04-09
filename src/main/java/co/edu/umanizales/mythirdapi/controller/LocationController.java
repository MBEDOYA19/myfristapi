package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Location;
import co.edu.umanizales.mythirdapi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/Location")
public class LocationController {
    /* @GetMapping
     public Location getlocation(){

         Location location = new Location("1","Manizales");

         return location;
     }

       }
   */
    @Autowired
    private LocationService locationService;

    @GetMapping("")
    public List<Location> getLocations() {
        try {
            String csvFilePath = "C:/Users/USUARIO/IdeaProjects/mythirdapi/src/main/java/co/edu/umanizales/mythirdapi/DIVIPOLA-_C_digos_municipios_20250326.csv";
            return locationService.getLocationsFromCSV(csvFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}