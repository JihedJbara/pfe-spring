package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.SOCAB;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface SocabRepository extends CrudRepository<SOCAB,Integer> {
    public SOCAB findByTSocab(int T_SOCAB);
}
