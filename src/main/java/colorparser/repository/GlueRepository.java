package colorparser.repository;

import colorparser.entities.Glue;
import colorparser.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GlueRepository extends MongoRepository<Glue,Integer> {
    Glue findBy_id(int id);
    List<Glue> findByName(String name);
}
