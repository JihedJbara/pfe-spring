package com.github.m0uj.starter.commons.storage.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;


/**
 * Created by Jihed-pc on 22/03/2018.
 */
@Entity
public class Groupe {


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String intitule;

    @OneToMany(mappedBy="groupe")
    private List<Salarie> salaries;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
