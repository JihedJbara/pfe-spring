package com.github.m0uj.starter.commons.storage.pojo;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Jihed-pc on 09/02/2018.
 */
@Entity
public class User extends AbstractPojo {
    //add WriteConcern=SAFE to get exceptions when "unique=true" constraint is violated
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    private String username;

    private String password;

    private boolean enable;

    private String  firstName;

    private String  lastName;

    @ManyToMany(targetEntity = Role.class, mappedBy = "users", fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<Role>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }


    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

/*@ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }*/