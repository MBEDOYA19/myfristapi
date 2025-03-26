package co.edu.umanizales.mythirdapi.controller;

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
        Seller Mateo = new Seller("name","Bedoya","18","H","1054862501","Manizales");
        Seller Valeria = new Seller("Valeria","Escudero","18","M","1054861524","Manizales");
        Seller Miguel = new Seller("Miguel","Ocampo","19","H","24828506","Manizales");
        Seller Nicolas = new Seller("Nicolas","Ordoñez","18","H","75091129","Manizales");
        Seller Sofia = new Seller("Sofia","Calvo","17","M","24821306","Manizales");
        return "vendedor";
    }
}
