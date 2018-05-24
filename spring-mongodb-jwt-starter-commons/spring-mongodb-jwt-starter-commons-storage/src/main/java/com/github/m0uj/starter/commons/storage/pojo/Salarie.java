package com.github.m0uj.starter.commons.storage.pojo;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Jihed-pc on 13/03/2018.
 */
@Entity
public class Salarie extends User {

    private String immatriculation;
    private int ncin;
    private Date dtDelivCin;
    private byte[] photo;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="groupe_ID")
    private Groupe groupe;


    public String getImmatriculation()
    {return immatriculation;}

    public void setImmatriculation(String immatriculation)
    {
        this.immatriculation = immatriculation;}

    public int getNcin() {
        return ncin;
    }

    public void setNcin(int ncin) {
        this.ncin = ncin;
    }

    public Date getDT_DELIV_CN() {
        return dtDelivCin;
    }

    public void setDT_DELIV_CN(Date DT_DELIV_CN) {
        this.dtDelivCin = DT_DELIV_CN;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
