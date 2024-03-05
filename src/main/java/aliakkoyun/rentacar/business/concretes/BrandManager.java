package aliakkoyun.rentacar.business.concretes;

import aliakkoyun.rentacar.business.abstracts.BrandService;
import aliakkoyun.rentacar.business.requests.brand.CreateBrandRequest;
import aliakkoyun.rentacar.business.requests.brand.DeleteBrandRequest;
import aliakkoyun.rentacar.business.requests.brand.UpdateBrandRequest;
import aliakkoyun.rentacar.business.responses.brand.GetAllBrandsResponse;
import aliakkoyun.rentacar.business.responses.brand.GetByIdBrandResponse;
import aliakkoyun.rentacar.core.utilities.mappers.ModelMapperService;
import aliakkoyun.rentacar.dataAccsess.abstracts.Postgre.BrandRepository;
import aliakkoyun.rentacar.entities.Brand;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    public BrandManager(BrandRepository brandRepository, ModelMapperService modelMapperService) {
        this.brandRepository = brandRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = brandRepository.findAll();


        //Mapper eklendi
        List<GetAllBrandsResponse> brandResponses = brands.stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class))
                .collect(Collectors.toList());


        return brandResponses;
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById((long)id).orElseThrow();
        GetByIdBrandResponse responseById = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);

        return responseById;
    }

    @Override
    public void add(CreateBrandRequest request) {
         //Brand brand = new Brand();
         // brand.setName(request.getName());

        //Mapper eklendi
         Brand brand = this.modelMapperService.forRequest().map(request, Brand.class);
          this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest request) {
        Brand brand = this.modelMapperService.forRequest().map(request, Brand.class);
        this.brandRepository.save(brand);

    }

    @Override
    public void delete(DeleteBrandRequest request) {
        this.brandRepository.deleteById((long) request.getId());
    }
}
