package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
public class F_ROUTE {

    @Id
    private int T_FROUTE;
    private int T_DOC_FRAIS;
    private Date DT_FROUTE;
    private String REMARQUE;
    private float MONTANT;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="DOC_FRAIS_ID")
    private DOC_FRAIS doc_fraiss;

    public int getT_FROUTE() {
        return T_FROUTE;
    }

    public void setT_FROUTE(int t_FROUTE) {
        T_FROUTE = t_FROUTE;
    }

    public int getT_DOC_FRAIS() {
        return T_DOC_FRAIS;
    }

    public void setT_DOC_FRAIS(int t_DOC_FRAIS) {
        T_DOC_FRAIS = t_DOC_FRAIS;
    }

    public Date getDT_FROUTE() {
        return DT_FROUTE;
    }

    public void setDT_FROUTE(Date DT_FROUTE) {
        this.DT_FROUTE = DT_FROUTE;
    }

    public String getREMARQUE() {
        return REMARQUE;
    }

    public void setREMARQUE(String REMARQUE) {
        this.REMARQUE = REMARQUE;
    }

    public float getMONTANT() {
        return MONTANT;
    }

    public void setMONTANT(float MONTANT) {
        this.MONTANT = MONTANT;
    }

    public DOC_FRAIS getDoc_fraiss() {
        return doc_fraiss;
    }

    public void setDoc_fraiss(DOC_FRAIS doc_fraiss) {
        this.doc_fraiss = doc_fraiss;
    }
}
