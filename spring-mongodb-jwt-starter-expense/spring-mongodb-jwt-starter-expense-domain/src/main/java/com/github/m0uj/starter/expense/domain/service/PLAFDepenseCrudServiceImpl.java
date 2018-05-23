package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.PlafRepository;
import com.github.m0uj.starter.expense.storage.pojo.PLAF_DEPENSE;
import com.github.m0uj.starter.expense.storage.pojo.UserPK3;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
@Service
public class PLAFDepenseCrudServiceImpl implements PLAFDepenseCrudService {
    private final PlafRepository plafRepository;

    public PLAFDepenseCrudServiceImpl(PlafRepository plafRepository) {
        this.plafRepository = plafRepository;
    }

    @Override
    public PLAF_DEPENSE create(PLAF_DEPENSE plaf_depense) {
        return plafRepository.save(plaf_depense);
    }

    @Override
    public PLAF_DEPENSE read(UserPK3 id) {
        return plafRepository.findByUserPK3(id);
    }
}
