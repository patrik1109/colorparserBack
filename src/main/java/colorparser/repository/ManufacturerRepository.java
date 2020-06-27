package colorparser.repository;

import colorparser.entities.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ManufacturerRepository extends MongoRepository<Manufacturer,Integer> {

    Manufacturer findBy_id(int id);
    List<Manufacturer> findByName(String name);
}
