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
    private char cTypeDepense;

    private String intitule;

    @OneToMany(mappedBy="type_frais")
    private List<TYPE_DEPENSE> type_depenses;

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public char getcTypeDepense() {
        return cTypeDepense;
    }

    public void setcTypeDepense(char cTypeDepense) {
        this.cTypeDepense = cTypeDepense;
    }

    public List<TYPE_DEPENSE> getType_depenses() {
        return type_depenses;
    }

    public void setType_depenses(List<TYPE_DEPENSE> type_depenses) {
        this.type_depenses = type_depenses;
    }
}
