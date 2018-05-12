package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.AbstractPojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by m0uj on 3/28/17.
 */
@NoRepositoryBean
public interface AbstractPojoBaseRepository<T extends AbstractPojo> extends CrudRepository<T, String> {
}
