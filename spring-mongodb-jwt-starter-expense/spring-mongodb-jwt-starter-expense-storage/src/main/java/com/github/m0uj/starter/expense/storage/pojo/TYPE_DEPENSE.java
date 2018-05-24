package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
public class TYPE_DEPENSE {
    @Id
    private char cTypeDepense;
    private String intitule;
    private char cTypeFrais;

    @OneToMany(mappedBy="type_depense")
    private List<PLAF_DEPENSE> plaf_depenses;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="TYPE_FRAIS_ID")
    private TYPE_FRAIS type_frais;

    public char getcTypeDepense() {
        return cTypeDepense;
    }

    public void setcTypeDepense(char cTypeDepense) {
        this.cTypeDepense = cTypeDepense;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public char getcTypeFrais() {
        return cTypeFrais;
    }

    public void setcTypeFrais(char cTypeFrais) {
        this.cTypeFrais = cTypeFrais;
    }

    public List<PLAF_DEPENSE> getPlaf_depenses() {
        return plaf_depenses;
    }

    public void setPlaf_depenses(List<PLAF_DEPENSE> plaf_depenses) {
        this.plaf_depenses = plaf_depenses;
    }

    public TYPE_FRAIS getType_frais() {
        return type_frais;
    }

    public void setType_frais(TYPE_FRAIS type_frais) {
        this.type_frais = type_frais;
    }
}
