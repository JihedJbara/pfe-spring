package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.FraisRepository;
import com.github.m0uj.starter.expense.storage.pojo.DOC_FRAIS;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 02/04/2018.
 */
@Service
public class FraisCrudServiceImpl implements FraisCrudService {
    private final FraisRepository fraisRepository;

    public FraisCrudServiceImpl(FraisRepository fraisRepository) {
        this.fraisRepository = fraisRepository;
    }

    @Override
    public DOC_FRAIS create(DOC_FRAIS frais) {
        return fraisRepository.save(frais);
    }

    @Override
    public DOC_FRAIS read(long id) {
        return fraisRepository.findByTDocFrais(id);
    }

   /* public void saveSalarie(DOC_FRAIS frais) {
        frais.setId(counter.incrementAndGet());
        salarie.add(salarie);
    }*/

}
