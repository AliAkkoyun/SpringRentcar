package aliakkoyun.rentacar.business.concretes;

import aliakkoyun.rentacar.business.abstracts.ModelService;
import aliakkoyun.rentacar.business.requests.model.CreateModelRequest;
import aliakkoyun.rentacar.business.responses.model.GetAllModelsResponse;
import aliakkoyun.rentacar.business.responses.model.GetByIdModelResponse;
import aliakkoyun.rentacar.core.utilities.mappers.ModelMapperService;
import aliakkoyun.rentacar.dataAccsess.abstracts.Postgre.ModelRepository;
import aliakkoyun.rentacar.entities.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = new ArrayList<>();

        List<GetAllModelsResponse> modelsResponses = models.stream()
                .map(model -> this.modelMapperService.forResponse().map(model, GetAllModelsResponse.class))
                .collect(Collectors.toList());

        return modelsResponses;
    }

    @Override
    public GetByIdModelResponse getById(int id) {
        return null;
    }

    @Override
    public void add(CreateModelRequest request) {
         Model model = this.modelMapperService.forRequest().map(request, Model.class);

         this.modelRepository.save(model);
    }
}
