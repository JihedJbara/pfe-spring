package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.dao.FRouteRepository;
import com.github.m0uj.starter.expense.storage.pojo.F_ROUTE;
import org.springframework.stereotype.Service;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Service
public class FRouteCrudServiceImpl implements FRouteCrudService {
    private final FRouteRepository fRouteRepository;

    public FRouteCrudServiceImpl(FRouteRepository fRouteRepository) {
        this.fRouteRepository = fRouteRepository;
    }

    @Override
    public F_ROUTE create(F_ROUTE f_route) {
        return fRouteRepository.save(f_route);
    }

    @Override
    public F_ROUTE read(int id) {
        return fRouteRepository.findByTFRoute(id);
    }
}
