package com.github.m0uj.starter.expense.storage.pojo;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Jihed-pc on 13/03/2018.
 */
@Entity
public class DOC_FRAIS {


    @Id
    private Long tDocFrais;
    private float totalFrais;
    private Date dtSoumission;
    private Date dtValidationPartiele;
    private Date dtValidation;
    private Date dtPayement;
    private Date dtRefus;
    private String motifRefus;
    private int totalFroute;
    private float totalDepense;
    private int tUserCre;
    private int tUserModif;
    private int tPUser ;
    private int totalNbreKm;


    @OneToMany(mappedBy="doc_frais")
    private List<F_DEPENSE> f_depenses;

    @OneToMany(mappedBy="doc_fraiss")
    private List<F_ROUTE> f_routes;


    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="EMPLOYE_ID")
    private EMPLOYE employe;


    @CreatedDate
    private Date dtCre;

    @LastModifiedDate
    private Date dtMod;


    public Date getDtCre() {
        return dtCre;
    }

    public void setDtCre(Date dtCre) {
        this.dtCre = dtCre;
    }

    public Date getDtMod() {
        return dtMod;
    }

    public void setDtMod(Date dtMod) {
        this.dtMod = dtMod;
    }

    public Date getDtValidation() {
        return dtValidation;
    }

    public float getTotalFrais() {
        return totalFrais;
    }

    public void setTotalFrais(float totalFrais) {
        this.totalFrais = totalFrais;
    }

    public Date getDtSoumission() {
        return dtSoumission;
    }

    public void setDtSoumission(Date dtSoumission) {
        this.dtSoumission = dtSoumission;
    }

    public Date getDtValidationPartiele() {
        return dtValidationPartiele;
    }

    public void setDtValidationPartiele(Date dtValidationPartiele) {
        this.dtValidationPartiele = dtValidationPartiele;
    }

    public Date getDtPayement() {
        return dtPayement;
    }

    public void setDtPayement(Date dtPayement) {
        this.dtPayement = dtPayement;
    }

    public Date getDtRefus() {
        return dtRefus;
    }

    public void setDtRefus(Date dtRefus) {
        this.dtRefus = dtRefus;
    }

    public String getMotifRefus() {
        return motifRefus;
    }

    public void setMotifRefus(String motifRefus) {
        this.motifRefus = motifRefus;
    }

    public int getTotalFroute() {
        return totalFroute;
    }

    public void setTotalFroute(int totalFroute) {
        this.totalFroute = totalFroute;
    }

    public float getTotalDepense() {
        return totalDepense;
    }

    public void setTotalDepense(float totalDepense) {
        this.totalDepense = totalDepense;
    }

    public int gettUserCre() {
        return tUserCre;
    }

    public void settUserCre(int tUserCre) {
        this.tUserCre = tUserCre;
    }

    public int gettUserModif() {
        return tUserModif;
    }

    public void settUserModif(int tUserModif) {
        this.tUserModif = tUserModif;
    }

    public int gettPUser() {
        return tPUser;
    }

    public void settPUser(int tPUser) {
        this.tPUser = tPUser;
    }

    public int getTotalNbreKm() {
        return totalNbreKm;
    }

    public void setTotalNbreKm(int totalNbreKm) {
        this.totalNbreKm = totalNbreKm;
    }

    public void setDtValidation(Date dtValidation) {
        this.dtValidation = dtValidation;
    }





    public EMPLOYE getEmploye() {
        return employe;
    }

    public void setEmploye(EMPLOYE employe) {
        this.employe = employe;
    }

    public List<F_DEPENSE> getF_depenses() {
        return f_depenses;
    }

    public void setF_depenses(List<F_DEPENSE> f_depenses) {
        this.f_depenses = f_depenses;
    }

    public List<F_ROUTE> getF_routes() {
        return f_routes;
    }

    public void setF_routes(List<F_ROUTE> f_routes) {
        this.f_routes = f_routes;
    }

    public long gettDocFrais() {
        return tDocFrais;
    }

    public void settDocFrais(long tDocFrais) {
        this.tDocFrais = tDocFrais;
    }
}
