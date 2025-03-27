package co.edu.umanizales.mythirdapi.controller;

import co.edu.umanizales.mythirdapi.model.Location;
import co.edu.umanizales.mythirdapi.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

@RestController
@RequestMapping(path = "/Seller")
public class SellerController {

    @GetMapping
    public String getSeller(){
        Location Manizales = new Location("17001", "Manizales");

        Seller Mateo = new Seller("Mateo","Bedoya",(byte)18,'M',"1054862501", Manizales);
        Seller Valeria = new Seller("Valeria","Escudero",(byte)18,'F',"1054861524",Manizales);
        Seller Miguel = new Seller("Miguel","Ocampo",(byte)19,'M',"24828506",Manizales);
        Seller Nicolas = new Seller("Nicolas","Ordoñez",(byte)18,'M',"75091129",Manizales);
        Seller Sofia = new Seller("Sofia","Calvo",(byte)17,'F',"24821306",Manizales);
        return "vendedor";
    }
}
