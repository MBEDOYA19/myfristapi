package co.edu.umanizales.mythirdapi.controller;


import co.edu.umanizales.mythirdapi.DTO.ProductDTO;
import co.edu.umanizales.mythirdapi.model.*;
import co.edu.umanizales.mythirdapi.service.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "/parameter")
public class ParameterController {

    @Autowired
    private ParameterService parameterService;

    @GetMapping(path = "/typedocuments")
    public List<Parameter> getTypeDocuments() {
        return parameterService.getParametersByType(1);
    }

    @GetMapping(path = "/typeproducts")
    public List<Parameter> getTypeProducts() {
        return parameterService.getParametersByType(2);
    }

    @GetMapping(path = "/products")
    public List<Parameter> getProducts() {
        return parameterService.getParametersByType(3);
    }

    @PostMapping(path = "/product")
    public String addProduct(@RequestBody ProductDTO product) {
        TypeProduct type = parameterService.getTypeProductByCode(product.getCodeTypeProduct());
        if (type == null) {
            return "Type Product with code " + product.getCode() + " does not exist";
        } else {
            return parameterService.addProduct(
                    new Product(product.getCode(), product.getDescription(),
                            product.getPrice(), product.getStock(), type));
        }

    }

    @PostMapping("/listproducts")
    public String saveProducts(@RequestBody List<ProductDTO> productsDTO) {
        List<Product> products = new ArrayList<>();
        for (ProductDTO productDTO : productsDTO) {
            TypeProduct type = parameterService.getTypeProductByCode(productDTO.getCodeTypeProduct());
            if (type == null) {
                return "Type Product with code " + productDTO.getCode() + " does not exist";
            } else {
                products.add(
                        new Product(productDTO.getCode(), productDTO.getDescription(),
                                productDTO.getPrice(), productDTO.getStock(), type));

            }
        }
        return parameterService.addProducts(products);
    }


    @GetMapping(path = "/product/{code}")
    public ResponseEntity<?> getProductByCode(@PathVariable String code) {
        Product product = parameterService.getProductByCode(code);
        if (product == null) {
            return ResponseEntity.badRequest()
                    .body("No se encontró el producto con el código: " + code);
        }
        return ResponseEntity.ok(List.of(product));
    }



    @GetMapping(path = "typedocument/{id}")
    public Parameter getTypeDocumentBycode(@PathVariable String code) {
        return parameterService.getTypeDocumentByCode(code);
    }
}
