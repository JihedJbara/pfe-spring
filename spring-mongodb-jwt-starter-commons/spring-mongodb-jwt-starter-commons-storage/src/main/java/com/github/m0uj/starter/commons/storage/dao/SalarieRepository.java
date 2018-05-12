package com.github.m0uj.starter.commons.storage.dao;


import com.github.m0uj.starter.commons.storage.pojo.Salarie;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Jihed-pc on 22/03/2018.
 */
@Transactional
public interface SalarieRepository extends AbstractPojoBaseRepository<Salarie>{

        public Salarie findById(String id);
        public Salarie findOneByUsername(String username);
}
