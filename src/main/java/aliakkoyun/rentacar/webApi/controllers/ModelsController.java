package aliakkoyun.rentacar.webApi.controllers;

import aliakkoyun.rentacar.business.abstracts.BrandService;
import aliakkoyun.rentacar.business.abstracts.ModelService;
import aliakkoyun.rentacar.business.responses.model.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {

    private ModelService modelService;

    @GetMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public List<GetAllModelsResponse> getAll(){
        return this.modelService.getAll();
    }
}
