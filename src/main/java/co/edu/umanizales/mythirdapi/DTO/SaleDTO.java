package co.edu.umanizales.mythirdapi.DTO;

import co.edu.umanizales.mythirdapi.model.ProductSale;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class SaleDTO {
    private String sellerIdentification;
    private String storeCode;
    private List<ProductSale> productCode;
    private LocalDate saleDate;
    private String code;
    private int quantity;
    private double subtotal;
}
