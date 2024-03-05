package aliakkoyun.rentacar.business.responses.model;

import aliakkoyun.rentacar.entities.Brand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdModelResponse {

    private int id;
    private String name;
    private String brandName;
}
