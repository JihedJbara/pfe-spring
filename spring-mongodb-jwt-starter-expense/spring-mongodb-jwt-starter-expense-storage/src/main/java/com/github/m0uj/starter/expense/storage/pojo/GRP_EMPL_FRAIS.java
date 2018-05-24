package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
public class GRP_EMPL_FRAIS implements Serializable {

    @EmbeddedId
    private UserPK2 userPK2;
    private String Intitule;
    private int tPyUserVal1;
    private int tPyUserVal2;
    private int tPyUserVal3;

  @OneToMany(mappedBy="grp_empl_frais")
    private List<EMPL_FRAIS> empl_frais;

    @OneToMany(mappedBy="grp_empl_frais")
   private List<PLAF_DEPENSE> plaf_depenses;

    public UserPK2 getUserPK2() {
        return userPK2;
    }

    public void setUserPK2(UserPK2 userPK2) {
        this.userPK2 = userPK2;
    }



    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String intitule) {
        Intitule = intitule;
    }

    public int gettPyUserVal1() {
        return tPyUserVal1;
    }

    public void settPyUserVal1(int tPyUserVal1) {
        this.tPyUserVal1 = tPyUserVal1;
    }

    public int gettPyUserVal2() {
        return tPyUserVal2;
    }

    public void settPyUserVal2(int tPyUserVal2) {
        this.tPyUserVal2 = tPyUserVal2;
    }

    public int gettPyUserVal3() {
        return tPyUserVal3;
    }

    public void settPyUserVal3(int tPyUserVal3) {
        this.tPyUserVal3 = tPyUserVal3;
    }

    /**public List<PLAF_DEPENSE> getPlaf_depenses() {
        return plaf_depenses;
    }


     public void setPlaf_depenses(List<PLAF_DEPENSE> plaf_depenses) {
        this.plaf_depenses = plaf_depenses;
    }           **/
}
