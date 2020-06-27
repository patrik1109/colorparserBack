package colorparser.service;

import colorparser.entities.Glue;
import colorparser.repository.GlueRepository;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GlueServiceImpl implements GlueService {
    @Autowired
    GlueRepository repository;

    @Override
    public void addGlue(Glue glue) {
        repository.save(glue);
    }

    @Override
    public void deleteGlue(Glue glue) {
        repository.delete(glue);
    }

    @Override
    public Glue findById(Integer id) {
        return repository.findBy_id(id);
    }

    @Override
    public List<Glue> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Glue> findAll() {
        return repository.findAll();
    }
}
