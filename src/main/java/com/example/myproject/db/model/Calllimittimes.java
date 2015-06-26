package com.example.myproject.db.model;

import java.io.Serializable;


/**
 * Calllimittimes
 */
public class Calllimittimes implements Serializable {


    private Integer iD;

    /**
     * getter iD
     */
    public Integer getID() {
        return iD;
    }

    /**
     * setter iD
     */
    public void setID(Integer iD) {
        this.iD = iD;
    }


    private String supplierID;

    /**
     * getter supplierID
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * setter supplierID
     */
    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }


    private Integer restUrlID;

    /**
     * getter restUrlID
     */
    public Integer getRestUrlID() {
        return restUrlID;
    }

    /**
     * setter restUrlID
     */
    public void setRestUrlID(Integer restUrlID) {
        this.restUrlID = restUrlID;
    }


    private Integer mtimes;

    /**
     * getter mtimes
     */
    public Integer getMtimes() {
        return mtimes;
    }

    /**
     * setter mtimes
     */
    public void setMtimes(Integer mtimes) {
        this.mtimes = mtimes;
    }


    private Integer htimes;

    /**
     * getter htimes
     */
    public Integer getHtimes() {
        return htimes;
    }

    /**
     * setter htimes
     */
    public void setHtimes(Integer htimes) {
        this.htimes = htimes;
    }


    private Integer dtimes;

    /**
     * getter dtimes
     */
    public Integer getDtimes() {
        return dtimes;
    }

    /**
     * setter dtimes
     */
    public void setDtimes(Integer dtimes) {
        this.dtimes = dtimes;
    }


    private Integer isUsed;

    /**
     * getter isUsed
     */
    public Integer getIsUsed() {
        return isUsed;
    }

    /**
     * setter isUsed
     */
    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }


}
