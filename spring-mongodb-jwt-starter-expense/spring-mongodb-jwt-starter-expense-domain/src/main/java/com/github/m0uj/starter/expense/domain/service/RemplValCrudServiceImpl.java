package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.RempRepository;
import com.github.m0uj.starter.expense.storage.pojo.REMP_VALID;
import com.github.m0uj.starter.expense.storage.pojo.UserPK4;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
@Service
public class RemplValCrudServiceImpl implements RempValCrudService {
    private final RempRepository rempRepository;

    public RemplValCrudServiceImpl(RempRepository rempRepository) {
        this.rempRepository = rempRepository;
    }

    @Override
    public REMP_VALID create(REMP_VALID remp_valid) {
        return rempRepository.save(remp_valid);
    }

    @Override
    public REMP_VALID read(UserPK4 id) {
        return rempRepository.findByUserPK4(id);
    }
}
