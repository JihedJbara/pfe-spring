package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.DOC_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.F_ROUTE;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface FRouteRepository extends CrudRepository<F_ROUTE,Integer> {
    public F_ROUTE findByTFRoute(int tFRoute);

}
