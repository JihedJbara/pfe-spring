package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Jihed-pc on 27/03/2018.
 */
@Entity
public class EMPLOYE {

    private int T_SOCAB;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int T_EMPLOYE;

    private String MAT_EMPL;
    private int ID_CARTE;
    private String NOM;
    private String PRENOM ;
    private int NCIN;
    private byte photo;
    private Date DATE_DELIV_CIN;

    @OneToMany(mappedBy="employe")
    private List<EMPL_FRAIS> empl_frais;

    @OneToMany(mappedBy="employe")
    private List<DOC_FRAIS> doc_frais;



    public int getT_SOCAB() {
        return T_SOCAB;
    }

    public void setT_SOCAB(int t_SOCAB) {
        T_SOCAB = t_SOCAB;
    }

    public int getT_EMPLOYE() {
        return T_EMPLOYE;
    }

    public void setT_EMPLOYE(int t_EMPLOYE) {
        T_EMPLOYE = t_EMPLOYE;
    }

    public String getMAT_EMPL() {
        return MAT_EMPL;
    }

    public void setMAT_EMPL(String MAT_EMPL) {
        this.MAT_EMPL = MAT_EMPL;
    }

    public int getID_CARTE() {
        return ID_CARTE;
    }

    public void setID_CARTE(int ID_CARTE) {
        this.ID_CARTE = ID_CARTE;
    }

    public String getNOM() {
        return NOM;
    }

    public void setNOM(String NOM) {
        this.NOM = NOM;
    }

    public String getPRENOM() {
        return PRENOM;
    }

    public void setPRENOM(String PRENOM) {
        this.PRENOM = PRENOM;
    }

    public int getNCIN() {
        return NCIN;
    }

    public void setNCIN(int NCIN) {
        this.NCIN = NCIN;
    }

    public byte getPhoto() {
        return photo;
    }

    public void setPhoto(byte photo) {
        this.photo = photo;
    }

    public Date getDATE_DELIV_CIN() {
        return DATE_DELIV_CIN;
    }

    public void setDATE_DELIV_CIN(Date DATE_DELIV_CIN) {
        this.DATE_DELIV_CIN = DATE_DELIV_CIN;
    }

    public List<EMPL_FRAIS> getEmpl_frais() {
        return empl_frais;
    }

    public void setEmpl_frais(List<EMPL_FRAIS> empl_frais) {
        this.empl_frais = empl_frais;
    }

    public List<DOC_FRAIS> getDoc_frais() {
        return doc_frais;
    }

    public void setDoc_frais(List<DOC_FRAIS> doc_frais) {
        this.doc_frais = doc_frais;
    }
}
