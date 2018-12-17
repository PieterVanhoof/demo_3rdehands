package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

@Entity
public class Koopje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 1,max = 30,message = "of niks ingevuld of veelte veel")
    private String username;
    @Size(min = 1)
    private String email;
    @DecimalMin("0.01")
    private double vraagPrijs;
    @Size(min = 1,max = 30,message = "of niks ingevuld of veelte veel")
    private String naam;
    private String omschrijving;

    public Koopje() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getVraagPrijs() {
        return vraagPrijs;
    }

    public void setVraagPrijs(double vraagPrijs) {
        this.vraagPrijs = vraagPrijs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
}

