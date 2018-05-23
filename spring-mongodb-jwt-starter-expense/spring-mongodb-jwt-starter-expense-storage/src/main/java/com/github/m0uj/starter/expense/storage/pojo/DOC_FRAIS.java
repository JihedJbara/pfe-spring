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
    private float TOTAL_FRAIS;
    private Date DT_SOUMISSION;
    private Date DT_VALIDATION_PARTIELE;
    private Date DT_VALIDATION;
    private Date DT_PAYEMENT;
    private Date DT_REFUS;
    private String MOTIF_REFUS;
    private int TOTAL_FROUTE;
    private float TOTAL_FDEPENSE;
    private int T_USER_CRE;
    private int T_USER_MOD;
    private int T_PYUSER ;
    private int TOTAL_NBRE_KM;


    @OneToMany(mappedBy="doc_frais")
    private List<F_DEPENSE> f_depenses;

    @OneToMany(mappedBy="doc_fraiss")
    private List<F_ROUTE> f_routes;


    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="EMPLOYE_ID")
    private EMPLOYE employe;


    @CreatedDate
    private Date DT_CRE;

    @LastModifiedDate
    private Date DT_MOD;


    public float getTOTAL_FRAIS() {
        return TOTAL_FRAIS;
    }

    public void setTOTAL_FRAIS(float TOTAL_FRAIS) {
        this.TOTAL_FRAIS = TOTAL_FRAIS;
    }

    public Date getDT_SOUMISSION() {
        return DT_SOUMISSION;
    }

    public void setDT_SOUMISSION(Date DT_SOUMISSION) {
        this.DT_SOUMISSION = DT_SOUMISSION;
    }

    public Date getDT_VALIDATION_PARTIELE() {
        return DT_VALIDATION_PARTIELE;
    }

    public void setDT_VALIDATION_PARTIELE(Date DT_VALIDATION_PARTIELE) {
        this.DT_VALIDATION_PARTIELE = DT_VALIDATION_PARTIELE;
    }

    public Date getDT_VALIDATION() {
        return DT_VALIDATION;
    }

    public void setDT_VALIDATION(Date DT_VALIDATION) {
        this.DT_VALIDATION = DT_VALIDATION;
    }

    public Date getDT_PAYEMENT() {
        return DT_PAYEMENT;
    }

    public void setDT_PAYEMENT(Date DT_PAYEMENT) {
        this.DT_PAYEMENT = DT_PAYEMENT;
    }

    public Date getDT_REFUS() {
        return DT_REFUS;
    }

    public void setDT_REFUS(Date DT_REFUS) {
        this.DT_REFUS = DT_REFUS;
    }

    public String getMOTIF_REFUS() {
        return MOTIF_REFUS;
    }

    public void setMOTIF_REFUS(String MOTIF_REFUS) {
        this.MOTIF_REFUS = MOTIF_REFUS;
    }

    public int getTOTAL_FROUTE() {
        return TOTAL_FROUTE;
    }

    public void setTOTAL_FROUTE(int TOTAL_FROUTE) {
        this.TOTAL_FROUTE = TOTAL_FROUTE;
    }

    public float getTOTAL_FDEPENSE() {
        return TOTAL_FDEPENSE;
    }

    public void setTOTAL_FDEPENSE(float TOTAL_FDEPENSE) {
        this.TOTAL_FDEPENSE = TOTAL_FDEPENSE;
    }

    public int getT_USER_CRE() {
        return T_USER_CRE;
    }

    public void setT_USER_CRE(int t_USER_CRE) {
        T_USER_CRE = t_USER_CRE;
    }

    public int getT_USER_MOD() {
        return T_USER_MOD;
    }

    public void setT_USER_MOD(int t_USER_MOD) {
        T_USER_MOD = t_USER_MOD;
    }

    public int getT_PYUSER() {
        return T_PYUSER;
    }

    public void setT_PYUSER(int t_PYUSER) {
        T_PYUSER = t_PYUSER;
    }
    public int getTOTAL_NBRE_KM() {
        return TOTAL_NBRE_KM;
    }

    public void setTOTAL_NBRE_KM(int TOTAL_NBRE_KM) {
        this.TOTAL_NBRE_KM = TOTAL_NBRE_KM;
    }

    public Date getDT_CRE() {
        return DT_CRE;
    }

    public void setDT_CRE(Date DT_CRE) {
        this.DT_CRE = DT_CRE;
    }

    public Date getDT_MOD() {
        return DT_MOD;
    }

    public void setDT_MOD(Date DT_MOD) {
        this.DT_MOD = DT_MOD;
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
