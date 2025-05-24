package co.edu.umanizales.mythirdapi.DTO;

import co.edu.umanizales.mythirdapi.model.ProductSale;

import java.time.LocalDate;
import java.util.List;

public class SaleDTO {
    private String seller;
    private String store;
    private List<ProductSale> products;
    private LocalDate saleDate;

}
