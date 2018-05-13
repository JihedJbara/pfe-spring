package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.TypeFraisRepository;
import com.github.m0uj.starter.expense.storage.pojo.TYPE_FRAIS;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
public class TYPEFriasCrudServiceImpl implements TYPEFraisCrudService{
    private final TypeFraisRepository typeFraisRepository;

    public TYPEFriasCrudServiceImpl(TypeFraisRepository typeFraisRepository) {
        this.typeFraisRepository = typeFraisRepository;
    }

    @Override
    public TYPE_FRAIS create(TYPE_FRAIS type_frais) {
        return typeFraisRepository.save(type_frais);
    }

    @Override
    public TYPE_FRAIS read(char id) {
        return typeFraisRepository.findById(id);
    }
}
