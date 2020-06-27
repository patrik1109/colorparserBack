package colorparser.service;

import colorparser.entities.Manufacturer;
import colorparser.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    ManufacturerRepository repository;

    @Override
    public void addManufacturer(Manufacturer manufacturer) {
        repository.save(manufacturer);
    }

    @Override
    public void deleteManufacturer(Manufacturer manufacturer) {
        repository.delete(manufacturer);
    }

    @Override
    public Manufacturer findBy_id(Integer id) {
        return repository.findBy_id(id);
    }

    @Override
    public List<Manufacturer> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Manufacturer> findAll() {
        return null;
    }
}
