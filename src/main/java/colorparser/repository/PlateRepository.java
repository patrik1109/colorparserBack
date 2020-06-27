package colorparser.repository;

import colorparser.entities.Plate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlateRepository  extends MongoRepository<Plate, String> {

    Plate findByNumber(String number);
    Plate findBy_id(int id);
    List<Plate> findByName(String name);
}
