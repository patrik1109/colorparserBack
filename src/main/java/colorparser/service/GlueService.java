package colorparser.service;

import colorparser.entities.Glue;
import com.mongodb.client.result.UpdateResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface GlueService {
    void addGlue(Glue glue);
    void deleteGlue(Glue glue);
    Glue findById(Integer id);
    List<Glue> findByName(String name);
    List<Glue> findAll();



}
