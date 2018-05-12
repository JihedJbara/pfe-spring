package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
public class F_DEPENSE {

    @Id
    private int T_FDEPENSE ;
    private int T_DOC_FRAIS;
    private char C_TYPE_DEPENSE;
    private Date DT_FDEPENSE;
    private String REMARQUE;
    private float MONTANT;
    private float MT_ACCP;
    private float MT_DEPASS;
    private float PLAFOND;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="CODE_DOC_FRAIS")
    private DOC_FRAIS doc_frais;

    public int getT_FDEPENSE() {
        return T_FDEPENSE;
    }

    public void setT_FDEPENSE(int t_FDEPENSE) {
        T_FDEPENSE = t_FDEPENSE;
    }

    public int getT_DOC_FRAIS() {
        return T_DOC_FRAIS;
    }

    public void setT_DOC_FRAIS(int t_DOC_FRAIS) {
        T_DOC_FRAIS = t_DOC_FRAIS;
    }

    public char getC_TYPE_DEPENSE() {
        return C_TYPE_DEPENSE;
    }

    public void setC_TYPE_DEPENSE(char c_TYPE_DEPENSE) {
        C_TYPE_DEPENSE = c_TYPE_DEPENSE;
    }

    public Date getDT_FDEPENSE() {
        return DT_FDEPENSE;
    }

    public void setDT_FDEPENSE(Date DT_FDEPENSE) {
        this.DT_FDEPENSE = DT_FDEPENSE;
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

    public float getMT_ACCP() {
        return MT_ACCP;
    }

    public void setMT_ACCP(float MT_ACCP) {
        this.MT_ACCP = MT_ACCP;
    }

    public float getMT_DEPASS() {
        return MT_DEPASS;
    }

    public void setMT_DEPASS(float MT_DEPASS) {
        this.MT_DEPASS = MT_DEPASS;
    }

    public float getPLAFOND() {
        return PLAFOND;
    }

    public void setPLAFOND(float PLAFOND) {
        this.PLAFOND = PLAFOND;
    }

    public DOC_FRAIS getDoc_frais() {
        return doc_frais;
    }

    public void setDoc_frais(DOC_FRAIS doc_frais) {
        this.doc_frais = doc_frais;
    }
}
