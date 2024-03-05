package aliakkoyun.rentacar.dataAccsess.abstracts.Postgre;

import aliakkoyun.rentacar.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
