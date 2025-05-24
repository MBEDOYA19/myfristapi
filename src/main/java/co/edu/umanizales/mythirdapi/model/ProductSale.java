package co.edu.umanizales.mythirdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductSale {
    private String code;
    private int quantity;
    private double subtotal;
    public Seller getSeller;
}
