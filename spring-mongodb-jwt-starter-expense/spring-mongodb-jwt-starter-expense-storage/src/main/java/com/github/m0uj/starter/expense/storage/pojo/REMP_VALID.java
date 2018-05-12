package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jihed-pc on 13/03/2018.
 */
@Entity
@IdClass(UserPK4.class)
public class REMP_VALID implements Serializable{
    @Id
    private int T_USER_REMPL;
    @Id
    private int T_USER_VALID;
    @Id
    private Date DT_DEBUT;




    private Date DATE_FIN;
    private int T_USER_CRE;
    private int T_USER_MOD;
    private Date DT_CRE;
    private Date DT_FIN;

    public Date getDATE_FIN() {
        return DATE_FIN;
    }

    public void setDATE_FIN(Date DATE_FIN) {
        this.DATE_FIN = DATE_FIN;
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

    public Date getDT_CRE() {
        return DT_CRE;
    }

    public void setDT_CRE(Date DT_CRE) {
        this.DT_CRE = DT_CRE;
    }

    public Date getDT_FIN() {
        return DT_FIN;
    }

    public void setDT_FIN(Date DT_FIN) {
        this.DT_FIN = DT_FIN;
    }
}
