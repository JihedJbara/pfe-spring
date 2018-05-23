package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Jihed-pc on 27/03/2018.
 */
@Entity
public class SOCAB {
    @Id
    private int tSocab;

    public int gettSOCAB() {
        return tSocab;
    }

    public void settSOCAB(int tSOCAB) {
        this.tSocab = tSOCAB;
    }
}
