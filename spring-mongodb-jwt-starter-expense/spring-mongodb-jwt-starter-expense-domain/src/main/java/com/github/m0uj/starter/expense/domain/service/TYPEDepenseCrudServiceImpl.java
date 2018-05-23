package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.TypeDepRepositoy;
import com.github.m0uj.starter.expense.storage.pojo.TYPE_DEPENSE;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
@Service
public class TYPEDepenseCrudServiceImpl implements TYPEDepenseCrudService {
    private final TypeDepRepositoy typeDepRepositoy;

    public TYPEDepenseCrudServiceImpl(TypeDepRepositoy typeDepRepositoy) {
        this.typeDepRepositoy = typeDepRepositoy;
    }

    @Override
    public TYPE_DEPENSE create(TYPE_DEPENSE type_depense) {
        return typeDepRepositoy.save(type_depense);
    }

    @Override
    public TYPE_DEPENSE read(char id) {
        return typeDepRepositoy.findByCTypeDepense(id);
    }
}
