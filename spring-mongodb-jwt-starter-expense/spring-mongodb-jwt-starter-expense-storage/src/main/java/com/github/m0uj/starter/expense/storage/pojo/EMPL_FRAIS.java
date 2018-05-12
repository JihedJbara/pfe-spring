package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
@IdClass(UserPK.class)
public class EMPL_FRAIS implements Serializable{
    @Id
    private int T_EMPLOYE;
    @Id
    private char C_GRP_EMPL_FRAIS;
    @Id
    private int T_SOCAB;
    private String ST;
    private String MAT_VEH;
    private String MARQUE_VEH;
    private int KM;
    private int DERN_KM;
    private float FORFAIT_KM;
    private char C_FORFAIT;
    private int TYPE_VOITURE;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="EMPLOY_ID")
    private EMPLOYE employe;



    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "GRP_EMPL_F_ID", insertable = false, updatable = false),
            @JoinColumn(name = "SOCAB_ID", insertable = false, updatable = false)
    })
   private GRP_EMPL_FRAIS grp_empl_frais;

    public int getT_EMPLOYE() {
        return T_EMPLOYE;
    }

    public void setT_EMPLOYE(int t_EMPLOYE) {
        T_EMPLOYE = t_EMPLOYE;
    }

    public char getC_GRP_EMPL_FRAIS() {
        return C_GRP_EMPL_FRAIS;
    }

    public void setC_GRP_EMPL_FRAIS(char c_GRP_EMPL_FRAIS) {
        C_GRP_EMPL_FRAIS = c_GRP_EMPL_FRAIS;
    }

    public int getT_SOCAB() {
        return T_SOCAB;
    }

    public void setT_SOCAB(int t_SOCAB) {
        T_SOCAB = t_SOCAB;
    }

    public String getST() {
        return ST;
    }

    public void setST(String ST) {
        this.ST = ST;
    }

    public String getMAT_VEH() {
        return MAT_VEH;
    }

    public void setMAT_VEH(String MAT_VEH) {
        this.MAT_VEH = MAT_VEH;
    }

    public String getMARQUE_VEH() {
        return MARQUE_VEH;
    }

    public void setMARQUE_VEH(String MARQUE_VEH) {
        this.MARQUE_VEH = MARQUE_VEH;
    }

    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public int getDERN_KM() {
        return DERN_KM;
    }

    public void setDERN_KM(int DERN_KM) {
        this.DERN_KM = DERN_KM;
    }

    public float getFORFAIT_KM() {
        return FORFAIT_KM;
    }

    public void setFORFAIT_KM(float FORFAIT_KM) {
        this.FORFAIT_KM = FORFAIT_KM;
    }

    public char getC_FORFAIT() {
        return C_FORFAIT;
    }

    public void setC_FORFAIT(char c_FORFAIT) {
        C_FORFAIT = c_FORFAIT;
    }

    public int getTYPE_VOITURE() {
        return TYPE_VOITURE;
    }

    public void setTYPE_VOITURE(int TYPE_VOITURE) {
        this.TYPE_VOITURE = TYPE_VOITURE;
    }

    public EMPLOYE getEmploye() {
        return employe;
    }

    public void setEmploye(EMPLOYE employe) {
        this.employe = employe;
    }




}
