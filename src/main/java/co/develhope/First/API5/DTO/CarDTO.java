package co.develhope.First.API5.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    @NotBlank(message = "Error 404")
    private String id;

    @NotBlank(message = "Error 404")
    private String modelName;
    private double price;
    public void getCar(String id, String modelName, double price){
        this.id=id;
        this.modelName=modelName;
        this.price=price;
    }

    public void getCar(){}

}
