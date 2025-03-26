package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Sale")
public class SaleController {
    @GetMapping
    public String getSale() {
        return "ID de la venta";
    }
}
