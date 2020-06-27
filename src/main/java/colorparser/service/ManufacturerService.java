package colorparser.service;

import colorparser.entities.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ManufacturerService {
    void addManufacturer(Manufacturer manufacturer);
    void deleteManufacturer(Manufacturer manufacturer);
    Manufacturer findBy_id(Integer id);
    List<Manufacturer> findByName(String name);
    List<Manufacturer> findAll();
}
