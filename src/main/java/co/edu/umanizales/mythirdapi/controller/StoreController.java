package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Store;
import co.edu.umanizales.mythirdapi.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/store")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @GetMapping("")
    public List<Store> getStores(){
        try{
            String csvFilepath = "C:/Users/USUARIO/IdeaProjects/mythirdapi/src/main/java/co/edu/umanizales/mythirdapi/store.csv";
            return storeService.getStoresFromCSV(csvFilepath);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}