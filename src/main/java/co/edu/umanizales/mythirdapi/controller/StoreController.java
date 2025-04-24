package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Store;
import co.edu.umanizales.mythirdapi.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "/store" )
public class StoreController {
    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<Store> getStore() {
        return storeService.getStores();
    }


}