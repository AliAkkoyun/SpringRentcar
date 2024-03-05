package aliakkoyun.rentacar.business.abstracts;

import aliakkoyun.rentacar.business.requests.brand.CreateBrandRequest;
import aliakkoyun.rentacar.business.requests.brand.DeleteBrandRequest;
import aliakkoyun.rentacar.business.requests.brand.UpdateBrandRequest;
import aliakkoyun.rentacar.business.responses.brand.GetAllBrandsResponse;
import aliakkoyun.rentacar.business.responses.brand.GetByIdBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest request);
    void update(UpdateBrandRequest request);

    void delete(DeleteBrandRequest request);
}
