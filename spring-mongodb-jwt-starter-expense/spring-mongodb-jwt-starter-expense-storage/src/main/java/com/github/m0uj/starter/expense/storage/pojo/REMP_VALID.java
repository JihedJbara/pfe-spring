package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jihed-pc on 13/03/2018.
 */
@Entity

public class REMP_VALID implements Serializable{
    @EmbeddedId
    private UserPK4 userPK4;



    private Date dateFin;
    private int tUserCre;
    private int tUserMod;
    private Date dtCre;
    private Date dtFin;

    public UserPK4 getUserPK4() {
        return userPK4;
    }

    public void setUserPK4(UserPK4 userPK4) {
        this.userPK4 = userPK4;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
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

    public Date getDtFin() {
        return dtFin;
    }

    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }
}
