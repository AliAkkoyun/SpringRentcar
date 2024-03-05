package aliakkoyun.rentacar.business.abstracts;

import aliakkoyun.rentacar.business.requests.model.CreateModelRequest;
import aliakkoyun.rentacar.business.responses.model.GetAllModelsResponse;
import aliakkoyun.rentacar.business.responses.model.GetByIdModelResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();
    GetByIdModelResponse getById(int id);
    void add(CreateModelRequest request);
}
