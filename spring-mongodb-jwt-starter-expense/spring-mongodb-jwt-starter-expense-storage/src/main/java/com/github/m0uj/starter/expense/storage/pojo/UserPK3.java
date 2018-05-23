package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Embeddable
public class UserPK3 implements Serializable {
   private char C_TYPE_DEPENSE;
    private char C_GRP_EMPL_FRAIS;
    private int T_SOCAB;

}
