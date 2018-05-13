package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.EMPLFraisRepository;
import com.github.m0uj.starter.expense.storage.dao.FDepenseRepository;
import com.github.m0uj.starter.expense.storage.pojo.F_DEPENSE;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Service
public class FDepenseCrudServiceImpl implements FDepenseCrudService {

    private final FDepenseRepository fDepenseRepository;

    public FDepenseCrudServiceImpl(FDepenseRepository fDepenseRepository) {
        this.fDepenseRepository = fDepenseRepository;
    }

    @Override
    public F_DEPENSE create(F_DEPENSE f_depense) {
        return fDepenseRepository.save(f_depense);
    }

    @Override
    public F_DEPENSE read(int id) {
        return fDepenseRepository.findById(id);
    }
}
