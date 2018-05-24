package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
public class F_ROUTE {

    @Id
    private int tFRoute;
    private int tDocFrais;
    private Date dtFroute;
    private String remarque;
    private float montant;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="DOC_FRAIS_ID")
    private DOC_FRAIS doc_fraiss;

    public int gettFRoute() {
        return tFRoute;
    }

    public void settFRoute(int tFRoute) {
        this.tFRoute = tFRoute;
    }

    public int gettDocFrais() {
        return tDocFrais;
    }

    public void settDocFrais(int tDocFrais) {
        this.tDocFrais = tDocFrais;
    }

    public Date getDtFroute() {
        return dtFroute;
    }

    public void setDtFroute(Date dtFroute) {
        this.dtFroute = dtFroute;
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

    public DOC_FRAIS getDoc_fraiss() {
        return doc_fraiss;
    }

    public void setDoc_fraiss(DOC_FRAIS doc_fraiss) {
        this.doc_fraiss = doc_fraiss;
    }
}
