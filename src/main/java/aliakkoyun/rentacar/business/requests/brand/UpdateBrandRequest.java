package aliakkoyun.rentacar.business.requests.brand;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBrandRequest {
    @NotNull
    @NotEmpty
    private int id;
    @NotNull
    @NotEmpty
    private String name;
}
