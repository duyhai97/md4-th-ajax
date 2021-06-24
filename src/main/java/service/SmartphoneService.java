package service;

import model.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ISmartphoneRepository;

import java.util.List;

public class SmartphoneService implements ISmartphoneService{

    @Autowired
    private ISmartphoneRepository repository;

    @Override
    public List<Smartphone> findAll() {
        return (List<Smartphone>) repository.findAll();
    }

    @Override
    public Smartphone findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return repository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        repository.delete(id);
    }
}
