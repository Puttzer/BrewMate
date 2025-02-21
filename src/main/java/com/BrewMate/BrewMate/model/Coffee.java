package com.BrewMate.BrewMate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "coffees") // Creates a table named 'coffees'
public class Coffee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    @Column(nullable = false, unique = true)   // Coffee name must be unique
    private String name;

    private int espressoRatio;
    private int milkRatio;
    private int foamRatio;
    private int waterRatio;

    // OPTIONAL See snapchat for more info
    // private String guideImage;


    public Coffee() {}
    public Coffee(String name, int espressoRatio, int milkRatio, int foamRatio, int waterRatio) {
        this.name = name;
        this.espressoRatio = espressoRatio;
        this.milkRatio = milkRatio;
        this.foamRatio = foamRatio;
        this.waterRatio = waterRatio;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }
 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEspressoRatio() {
        return espressoRatio;
    }

    public void setEspressoRatio(int espressoRatio) {
        this.espressoRatio = espressoRatio;
    }

    public int getMilkRatio() {
        return milkRatio;
    }

    public void setMilkRatio(int milkRatio) {
        this.milkRatio = milkRatio;
    }

    public int getFoamRatio() {
        return foamRatio;
    }

    public void setFoamRatio(int foamRatio) {
        this.foamRatio = foamRatio;
    }

    public int getWaterRatio() {
        return waterRatio;
    }

    public void setWaterRatio(int waterRatio) {
        this.waterRatio = waterRatio;
    }

    // OPTIONAL See snapchat for more info
   /*  public String getGuideImage() {
        return guideImage;
    } */

    // OPTIONAL See snapchat for more info
    /* public void setGuideImage(String guideImage) {
        this.guideImage = guideImage;
    } */



}
