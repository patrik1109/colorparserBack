package colorparser.service;

import colorparser.entities.Plate;
import colorparser.repository.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlateServiceImpl implements PlateService {

    @Autowired
    PlateRepository repository;


    @Override
    public void addPlate(Plate plate) {
        repository.save(plate);
    }

    @Override
    public void deletePlate(Plate plate) {
        repository.delete(plate);
    }


    @Override
    public Plate findBy_id(Integer id) {
        return repository.findBy_id(id);
    }

    @Override
    public List<Plate> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Plate> findAll() {
        return repository.findAll();
    }
}
