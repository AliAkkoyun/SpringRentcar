package aliakkoyun.rentacar.webApi.controllers;

import aliakkoyun.rentacar.business.abstracts.BrandService;
import aliakkoyun.rentacar.business.requests.brand.CreateBrandRequest;
import aliakkoyun.rentacar.business.requests.brand.DeleteBrandRequest;
import aliakkoyun.rentacar.business.requests.brand.UpdateBrandRequest;
import aliakkoyun.rentacar.business.responses.brand.GetAllBrandsResponse;
import aliakkoyun.rentacar.business.responses.brand.GetByIdBrandResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping()
    @ResponseStatus(code = HttpStatus.CREATED  )
    public List<GetAllBrandsResponse> GetAll(){
        return brandService.getAll( );
    }


    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(CreateBrandRequest request){
        this.brandService.add(request);
    }
    @PutMapping
    public void update(@RequestBody UpdateBrandRequest request){
        this.brandService.update(request);
    }

    @GetMapping("/{id}")
    public GetByIdBrandResponse getById(@PathVariable int id){
         return this.brandService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable DeleteBrandRequest request){
        this.brandService.delete(request);
    }
}










