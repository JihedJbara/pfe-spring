package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Jihed-pc on 27/03/2018.
 */
@Entity
public class SOCAB {
    @Id
    private int T_SOCAB;

    public int getT_SOCAB() {
        return T_SOCAB;
    }

    public void setT_SOCAB(int t_SOCAB) {
        T_SOCAB = t_SOCAB;
    }
}
