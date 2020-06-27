package colorparser.service;

import colorparser.entities.Miks;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface MiksService {
    void addMiks(Miks miks);
    void deleteMiks(Miks miks);
    Miks findBy_id(Integer id);
    List<Miks> findByName(String name);
    List<Miks> findAll();
}
