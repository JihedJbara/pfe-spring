package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Embeddable
public class UserPK implements Serializable {
    private int T_EMPLOYE;
    private char C_GRP_EMPL_FRAIS;
    private int T_SOCAB;



}
