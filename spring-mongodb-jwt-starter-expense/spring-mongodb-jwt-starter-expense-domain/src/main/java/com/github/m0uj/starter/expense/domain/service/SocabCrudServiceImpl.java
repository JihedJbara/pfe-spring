package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.SocabRepository;
import com.github.m0uj.starter.expense.storage.pojo.SOCAB;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
@Service
public class SocabCrudServiceImpl implements SocabCrudService{
    private final SocabRepository socabRepository;

    public SocabCrudServiceImpl(SocabRepository socabRepository) {
        this.socabRepository = socabRepository;
    }

    @Override
    public SOCAB create(SOCAB socab) {
        return socabRepository.save(socab);
    }

    @Override
    public SOCAB read(int id) {
        return socabRepository.findByTSocab(id);
    }
}
