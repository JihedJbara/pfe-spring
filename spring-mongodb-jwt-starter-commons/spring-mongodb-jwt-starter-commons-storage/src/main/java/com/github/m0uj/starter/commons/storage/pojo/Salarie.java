package com.github.m0uj.starter.commons.storage.pojo;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Jihed-pc on 13/03/2018.
 */
@Entity
public class Salarie extends User {

    private String Immatriculation;
    private int NCIN;
    private Date DT_DELIV_CIN;
    private byte[] photo;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="groupe_ID")
    private Groupe groupe;


    public String getImmatriculation()
    {return Immatriculation;}

    public void setImmatriculation(String immatriculation)
    {Immatriculation = immatriculation;}

    public int getNCIN() {
        return NCIN;
    }

    public void setNCIN(int NCIN) {
        this.NCIN = NCIN;
    }

    public Date getDT_DELIV_CN() {
        return DT_DELIV_CIN;
    }

    public void setDT_DELIV_CN(Date DT_DELIV_CN) {
        this.DT_DELIV_CIN = DT_DELIV_CN;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
