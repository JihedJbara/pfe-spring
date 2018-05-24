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
    private Date dtDeb;
    private Date dtFin;
    private int tUserCre;
    private int tUserMod;
    private Date dtCre;
    private Date deMod;

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

    public Date getDtDeb() {
        return dtDeb;
    }

    public void setDtDeb(Date dtDeb) {
        this.dtDeb = dtDeb;
    }

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }

    public int gettUserCre() {
        return tUserCre;
    }

    public void settUserCre(int tUserCre) {
        this.tUserCre = tUserCre;
    }

    public int gettUserMod() {
        return tUserMod;
    }

    public void settUserMod(int tUserMod) {
        this.tUserMod = tUserMod;
    }

    public Date getDtCre() {
        return dtCre;
    }

    public void setDtCre(Date dtCre) {
        this.dtCre = dtCre;
    }

    public Date getDeMod() {
        return deMod;
    }

    public void setDeMod(Date deMod) {
        this.deMod = deMod;
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
