package Reto4Ciclo4.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author jotajotamc
 */

@Data
@NoArgsConstructor
@Document(collection = "product")
public class Product {

    @Id
    private String reference;
    private String brand;
    private String category;
    private String description;
    private boolean availability;
    private double price;
    private Integer quantity;
    private String photography;

}
