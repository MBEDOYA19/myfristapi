package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Location;
import co.edu.umanizales.mythirdapi.model.Seller;
import co.edu.umanizales.mythirdapi.model.Store;
import co.edu.umanizales.mythirdapi.service.SellerService;
import co.edu.umanizales.mythirdapi.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<Store> getStores() {
        return storeService.getStores();
    }

    @GetMapping(path = "/{code}")
    public Store getStoreByCode(@PathVariable String code) {
        return storeService.getStoreByCode(code);

    }
}