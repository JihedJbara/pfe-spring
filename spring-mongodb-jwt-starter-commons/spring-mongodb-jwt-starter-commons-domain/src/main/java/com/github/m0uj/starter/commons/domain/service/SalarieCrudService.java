package com.github.m0uj.starter.commons.domain.service;

import com.github.m0uj.starter.commons.storage.pojo.Salarie;


/**
 * Created by Jihed-pc on 22/03/2018.
 */

public interface  SalarieCrudService {

    public Salarie create(Salarie salarie);

    public Salarie read(String id);

    public void saveSalarie (Salarie salarie);

    public  boolean isUserExist (Salarie salarie);

}
