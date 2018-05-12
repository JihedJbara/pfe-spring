package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.TYPE_DEPENSE;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface TypeDepRepositoy extends CrudRepository<TYPE_DEPENSE,Integer> {
    public TYPE_DEPENSE findById(int C_TYPE_DEPENSE);

}
