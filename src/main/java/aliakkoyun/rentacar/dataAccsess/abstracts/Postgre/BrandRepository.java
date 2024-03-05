package aliakkoyun.rentacar.dataAccsess.abstracts.Postgre;

import aliakkoyun.rentacar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    boolean existsByName(String name);
}
