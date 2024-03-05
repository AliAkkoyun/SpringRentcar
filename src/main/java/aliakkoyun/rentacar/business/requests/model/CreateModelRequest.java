package aliakkoyun.rentacar.business.requests.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateModelRequest {
    @NotEmpty
    @NotNull
    @Size(min = 3, max = 20)
    private String name;
    @NotNull
    @NotEmpty
    private String brandId;
}
