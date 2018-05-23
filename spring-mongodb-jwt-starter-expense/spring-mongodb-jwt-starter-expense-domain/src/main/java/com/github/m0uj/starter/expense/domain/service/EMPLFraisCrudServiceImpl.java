package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.EMPLFraisRepository;
import com.github.m0uj.starter.expense.storage.pojo.EMPL_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.UserPK;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Service
public class EMPLFraisCrudServiceImpl implements EMPLFraisCrudService{
    private final EMPLFraisRepository emplFraisRepository;
    private static final AtomicLong counter = new AtomicLong();


    public EMPLFraisCrudServiceImpl(EMPLFraisRepository emplFraisRepository) {
        this.emplFraisRepository = emplFraisRepository;
    }

    @Override
    public EMPL_FRAIS create(EMPL_FRAIS empl_frais) {
        return emplFraisRepository.save(empl_frais);
    }

    @Override
    public EMPL_FRAIS read(UserPK id) {
        return emplFraisRepository.findByUserPK(id);
    }

    public void saveSalarie(EMPL_FRAIS empl_frais) {
        emplFraisRepository.save(empl_frais);

    }
}
