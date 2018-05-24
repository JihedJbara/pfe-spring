package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity

public class EMPL_FRAIS implements Serializable{

    @EmbeddedId
    private UserPK userPK;

    private String st;
    private String matVeh;
    private String marqueVeh;
    private int km;
    private int dernKm;
    private float forfaitKm;
    private char cForfait;
    private int typeVoiture;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="EMPLOY_ID")
    private EMPLOYE employe;



    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "GRP_EMPL_F_ID", insertable = false, updatable = false),
            @JoinColumn(name = "SOCAB_ID", insertable = false, updatable = false)
    })
   private GRP_EMPL_FRAIS grp_empl_frais;

    public UserPK getUserPK() {
        return userPK;
    }

    public void setUserPK(UserPK userPK) {
        this.userPK = userPK;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getMatVeh() {
        return matVeh;
    }

    public void setMatVeh(String matVeh) {
        this.matVeh = matVeh;
    }

    public String getMarqueVeh() {
        return marqueVeh;
    }

    public void setMarqueVeh(String marqueVeh) {
        this.marqueVeh = marqueVeh;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getDernKm() {
        return dernKm;
    }

    public void setDernKm(int dernKm) {
        this.dernKm = dernKm;
    }

    public float getForfaitKm() {
        return forfaitKm;
    }

    public void setForfaitKm(float forfaitKm) {
        this.forfaitKm = forfaitKm;
    }

    public char getcForfait() {
        return cForfait;
    }

    public void setcForfait(char cForfait) {
        this.cForfait = cForfait;
    }

    public int getTypeVoiture() {
        return typeVoiture;
    }

    public void setTypeVoiture(int typeVoiture) {
        this.typeVoiture = typeVoiture;
    }

    public EMPLOYE getEmploye() {
        return employe;
    }

    public void setEmploye(EMPLOYE employe) {
        this.employe = employe;
    }




}
