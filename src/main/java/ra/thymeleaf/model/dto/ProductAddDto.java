package ra.thymeleaf.model.dto;

import lombok.Data;

import java.util.Date;
@Data
public class ProductAddDto {
    private String name;
    private  double price;
    private  Integer stock;
    private String url;
}
