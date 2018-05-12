package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Jihed-pc on 16/03/2018.
 */
@Entity
@IdClass(UserPK2.class)
public class GRP_EMPL_FRAIS implements Serializable {

    @Id
    private char C_GRP_EMPL_FRAIS ;
    @Id
    private int T_SOCAB;
    private String Intitule;
    private int T_PYUSER_VAL1;
    private int T_PYUSER_VAL2;
    private int T_PYUSER_VAL3;

  @OneToMany(mappedBy="grp_empl_frais")
    private List<EMPL_FRAIS> empl_frais;

    @OneToMany(mappedBy="grp_empl_frais")
   private List<PLAF_DEPENSE> plaf_depenses;
    
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
