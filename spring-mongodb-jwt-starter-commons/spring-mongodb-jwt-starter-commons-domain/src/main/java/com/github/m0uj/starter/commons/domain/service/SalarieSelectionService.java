package com.github.m0uj.starter.commons.domain.service;

import com.github.m0uj.starter.commons.storage.pojo.Salarie;

/**
 * Created by Jihed-pc on 22/03/2018.
 */
public interface SalarieSelectionService {
    public Salarie selectByUsername(String username);

}
