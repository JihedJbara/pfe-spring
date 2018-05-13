package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.GRPEmplFRepository;
import com.github.m0uj.starter.expense.storage.pojo.GRP_EMPL_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.UserPK2;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
@Service
public class GRPEmplCrudServiceImpl implements GRPEmplCrudService {
    private final GRPEmplFRepository grpEmplFRepository;

    public GRPEmplCrudServiceImpl(GRPEmplFRepository grpEmplFRepository) {
        this.grpEmplFRepository = grpEmplFRepository;
    }

    @Override
    public GRP_EMPL_FRAIS create(GRP_EMPL_FRAIS grp_empl_frais) {
        return grpEmplFRepository.save(grp_empl_frais);
    }

    @Override
    public GRP_EMPL_FRAIS read(UserPK2 id) {
        return grpEmplFRepository.findByIdAndGRP(id);
    }
}
