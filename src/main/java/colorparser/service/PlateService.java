package colorparser.service;

import colorparser.entities.Plate;
import com.mongodb.client.result.UpdateResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlateService {
    void addPlate(Plate plate);
    void deletePlate(Plate plate);
    Plate findBy_id(Integer id);
    List<Plate> findByName(String name);
    List<Plate> findAll();
}
