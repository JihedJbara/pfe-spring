package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Embeddable
public class UserPK4 implements Serializable {
    private int T_USER_REMPL;
    private int T_USER_VALID;
    private Date DT_DEBUT;
}
