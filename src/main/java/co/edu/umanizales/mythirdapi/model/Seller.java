package co.edu.umanizales.mythirdapi.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Seller {
    private String name;
    private String lastname;
    private String age;
    private String gender;
    private String identification;
    private String location;
}
