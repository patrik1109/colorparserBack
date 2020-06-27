package colorparser.repository;

import colorparser.entities.Miks;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MiksRepository extends MongoRepository<Miks,Integer> {
    Miks findBy_id(int id);
    List<Miks> findByName(String name);
}
