package com.github.m0uj.starter.commons.domain.service;

import com.github.m0uj.starter.commons.storage.dao.SalarieRepository;
import com.github.m0uj.starter.commons.storage.pojo.Salarie;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 22/03/2018.
 */

@Service
public class SalarieSelectionServiceImpl implements SalarieSelectionService  {

    private final SalarieRepository salarieRepository;

    public SalarieSelectionServiceImpl(SalarieRepository salarieRepository) {
        this.salarieRepository = salarieRepository;
    }

    @Override
    public Salarie selectByUsername(String username) {
        return salarieRepository.findOneByUsername(username);
    }
}