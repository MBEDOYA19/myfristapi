package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Store")
public class StoreController {

    @GetMapping
    public String hello(){
        return "Hola lindos ";
    }
}
