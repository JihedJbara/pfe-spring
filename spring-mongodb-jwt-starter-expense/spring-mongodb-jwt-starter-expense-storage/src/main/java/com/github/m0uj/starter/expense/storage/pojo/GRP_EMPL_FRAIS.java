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
    private int T_PYUSER_VAL1;
    private int T_PYUSER_VAL2;
    private int T_PYUSER_VAL3;

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

    public int getT_PYUSER_VAL1() {
        return T_PYUSER_VAL1;
    }

    public void setT_PYUSER_VAL1(int t_PYUSER_VAL1) {
        T_PYUSER_VAL1 = t_PYUSER_VAL1;
    }

    public int getT_PYUSER_VAL2() {
        return T_PYUSER_VAL2;
    }

    public void setT_PYUSER_VAL2(int t_PYUSER_VAL2) {
        T_PYUSER_VAL2 = t_PYUSER_VAL2;
    }

    public int getT_PYUSER_VAL3() {
        return T_PYUSER_VAL3;
    }

    public void setT_PYUSER_VAL3(int t_PYUSER_VAL3) {
        T_PYUSER_VAL3 = t_PYUSER_VAL3;
    }

  
  
  


    /**public List<PLAF_DEPENSE> getPlaf_depenses() {
        return plaf_depenses;
    }


     public void setPlaf_depenses(List<PLAF_DEPENSE> plaf_depenses) {
        this.plaf_depenses = plaf_depenses;
    }           **/
}
