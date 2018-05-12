package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Jihed-pc on 15/03/2018.
 */

@Entity
public class TYPE_FRAIS {

    @Id
    private char C_TYPE_DEPENSE;

    private String INITULE;

    @OneToMany(mappedBy="type_frais")
    private List<TYPE_DEPENSE> type_depenses;

    public String getINITULE() {
        return INITULE;
    }

    public void setINITULE(String INITULE) {
        this.INITULE = INITULE;
    }

    public char getC_TYPE_DEPENSE() {
        return C_TYPE_DEPENSE;
    }

    public void setC_TYPE_DEPENSE(char c_TYPE_DEPENSE) {
        C_TYPE_DEPENSE = c_TYPE_DEPENSE;
    }

    public List<TYPE_DEPENSE> getType_depenses() {
        return type_depenses;
    }

    public void setType_depenses(List<TYPE_DEPENSE> type_depenses) {
        this.type_depenses = type_depenses;
    }
}
