package com.github.m0uj.starter.commons.domain.service;
import com.github.m0uj.starter.commons.storage.dao.SalarieRepository;
import com.github.m0uj.starter.commons.storage.pojo.Salarie;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Jihed-pc on 22/03/2018.
 */
@Service
public class SalarieCrudServiceImpl implements SalarieCrudService {
    private final SalarieRepository salarieRepository;
    private static final AtomicLong counter = new AtomicLong();


    public SalarieCrudServiceImpl(SalarieRepository salarieRepository) {
        this.salarieRepository = salarieRepository;
    }

    @Override
    public Salarie create(Salarie salarie) {
        return salarieRepository.save(salarie);
    }

    @Override
    public Salarie read(String id) {
        return salarieRepository.findById(id);
    }

    public void saveSalarie(Salarie salarie) {
        salarie.setId(counter.incrementAndGet());
       // salarie.add(salarie);
    }

    public boolean isUserExist(Salarie salarie) {
        return read (salarie.getImmatriculation())!=null;
    }
}
