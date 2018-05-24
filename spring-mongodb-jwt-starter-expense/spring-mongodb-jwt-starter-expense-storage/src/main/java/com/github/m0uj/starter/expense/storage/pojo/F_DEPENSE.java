package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
public class F_DEPENSE {

    @Id
    private int tFDepense;
    private int tDocFrais;
    private char cTypeDepense;
    private Date dtFdepense;
    private String remarque;
    private float montant;
    private float mtAccp;
    private float mtDepass;
    private float plafond;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="CODE_DOC_FRAIS")
    private DOC_FRAIS doc_frais;

    public int gettFDepense() {
        return tFDepense;
    }

    public void settFDepense(int tFDepense) {
        this.tFDepense = tFDepense;
    }

    public int gettDocFrais() {
        return tDocFrais;
    }

    public void settDocFrais(int tDocFrais) {
        this.tDocFrais = tDocFrais;
    }

    public char getcTypeDepense() {
        return cTypeDepense;
    }

    public void setcTypeDepense(char cTypeDepense) {
        this.cTypeDepense = cTypeDepense;
    }

    public Date getDtFdepense() {
        return dtFdepense;
    }

    public void setDtFdepense(Date dtFdepense) {
        this.dtFdepense = dtFdepense;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public float getMtAccp() {
        return mtAccp;
    }

    public void setMtAccp(float mtAccp) {
        this.mtAccp = mtAccp;
    }

    public float getMtDepass() {
        return mtDepass;
    }

    public void setMtDepass(float mtDepass) {
        this.mtDepass = mtDepass;
    }

    public float getPlafond() {
        return plafond;
    }

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }

    public DOC_FRAIS getDoc_frais() {
        return doc_frais;
    }

    public void setDoc_frais(DOC_FRAIS doc_frais) {
        this.doc_frais = doc_frais;
    }
}
