package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jihed-pc on 13/03/2018.
 */
@Entity

public class PLAF_DEPENSE implements Serializable {


    @EmbeddedId
    private UserPK3 userPK3;
    private float PLAFOND;
    private Date DT_DEB;
    private Date DT_FIN;
    private int T_USER_CRE;
    private int T_USER_MOD;
    private Date DT_CRE;
    private Date DT_MOD;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="TYPE_DEP_ID")
    private TYPE_DEPENSE type_depense;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "GRP_EMPL_F_ID", insertable = false, updatable = false),
            @JoinColumn(name = "SOCAB_ID", insertable = false, updatable = false)
    })
    private GRP_EMPL_FRAIS grp_empl_frais;



    public float getPLAFOND() {
        return PLAFOND;
    }
    public void setPLAFOND(float PLAFOND) {
        this.PLAFOND = PLAFOND;
    }

    public Date getDT_DEB() {
        return DT_DEB;
    }

    public void setDT_DEB(Date DT_DEB) {
        this.DT_DEB = DT_DEB;
    }

    public Date getDT_FIN() {
        return DT_FIN;
    }

    public void setDT_FIN(Date DT_FIN) {
        this.DT_FIN = DT_FIN;
    }

    public UserPK3 getUserPK3() {
        return userPK3;
    }

    public void setUserPK3(UserPK3 userPK3) {
        this.userPK3 = userPK3;
    }

    public void setT_USER_CRE(int t_USER_CRE) {
        T_USER_CRE = t_USER_CRE;
    }

    public void setT_USER_MOD(int t_USER_MOD) {
        T_USER_MOD = t_USER_MOD;
    }

    public void setDT_CRE(Date DT_CRE) {
        this.DT_CRE = DT_CRE;
    }

    public void setDT_MOD(Date DT_MOD) {
        this.DT_MOD = DT_MOD;
    }



    public int getT_USER_CRE() {
        return T_USER_CRE;
    }

    public int getT_USER_MOD() {
        return T_USER_MOD;
    }

    public Date getDT_CRE() {
        return DT_CRE;
    }

    public Date getDT_MOD() {
        return DT_MOD;
    }

    public TYPE_DEPENSE getType_depense() {
        return type_depense;
    }

    public void setType_depense(TYPE_DEPENSE type_depense) {
        this.type_depense = type_depense;
    }
    public GRP_EMPL_FRAIS getGrp_empl_frais() {
       return grp_empl_frais;
    }

   public void setGrp_empl_frais(GRP_EMPL_FRAIS grp_empl_frais) {
        this.grp_empl_frais = grp_empl_frais;
    }
}
