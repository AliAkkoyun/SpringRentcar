package aliakkoyun.rentacar.dataAccsess.abstracts.Postgre;

import aliakkoyun.rentacar.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
