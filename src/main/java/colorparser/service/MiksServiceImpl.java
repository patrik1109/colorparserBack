package colorparser.service;

import colorparser.entities.Miks;
import colorparser.repository.MiksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiksServiceImpl implements MiksService {

    @Autowired
    MiksRepository repository;

    @Override
    public void addMiks(Miks miks) {
        repository.save(miks);
    }

    @Override
    public void deleteMiks(Miks miks) {
        repository.delete(miks);
    }

    @Override
    public Miks findBy_id(Integer id) {
        return repository.findBy_id(id);
    }

    @Override
    public List<Miks> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Miks> findAll() {
        return repository.findAll();
    }
}
