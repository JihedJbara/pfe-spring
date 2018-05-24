package com.github.m0uj.starter.expense.storage.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Jihed-pc on 27/03/2018.
 */
@Entity
public class EMPLOYE {

    private int tSocab;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tEmploye;

    private String matEmpl;
    private int idCarte;
    private String nom;
    private String prenom ;
    private int nCin;
    private byte photo;
    private Date dateDelivCin;

    @OneToMany(mappedBy="employe")
    private List<EMPL_FRAIS> empl_frais;

    @OneToMany(mappedBy="employe")
    private List<DOC_FRAIS> doc_frais;


    public int gettSocab() {
        return tSocab;
    }

    public void settSocab(int tSocab) {
        this.tSocab = tSocab;
    }

    public int gettEmploye() {
        return tEmploye;
    }

    public void settEmploye(int tEmploye) {
        this.tEmploye = tEmploye;
    }

    public String getMatEmpl() {
        return matEmpl;
    }

    public void setMatEmpl(String matEmpl) {
        this.matEmpl = matEmpl;
    }

    public int getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getnCin() {
        return nCin;
    }

    public void setnCin(int nCin) {
        this.nCin = nCin;
    }

    public byte getPhoto() {
        return photo;
    }

    public void setPhoto(byte photo) {
        this.photo = photo;
    }

    public Date getDateDelivCin() {
        return dateDelivCin;
    }

    public void setDateDelivCin(Date dateDelivCin) {
        this.dateDelivCin = dateDelivCin;
    }

    public List<EMPL_FRAIS> getEmpl_frais() {
        return empl_frais;
    }

    public void setEmpl_frais(List<EMPL_FRAIS> empl_frais) {
        this.empl_frais = empl_frais;
    }

    public List<DOC_FRAIS> getDoc_frais() {
        return doc_frais;
    }

    public void setDoc_frais(List<DOC_FRAIS> doc_frais) {
        this.doc_frais = doc_frais;
    }
}
