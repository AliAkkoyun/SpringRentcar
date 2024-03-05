package aliakkoyun.rentacar.business.rules;

import aliakkoyun.rentacar.core.utilities.Exceptions.BusinessException;
import aliakkoyun.rentacar.dataAccsess.abstracts.Postgre.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {

    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name){
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand already Exists.");
        }
    }
}
