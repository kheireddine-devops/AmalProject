package com.amal.amalproject.entities;

import java.util.Date;
import java.util.Objects;

public class formation {
    private int id_formation;
    private String theme;
    private String descriptif;
    private Date Date_publication;

    public formation() {
    }

    public formation(int id_formation, String theme, String descriptif, Date date_publication) {
        this.id_formation = id_formation;
        this.theme = theme;
        this.descriptif = descriptif;
        Date_publication = date_publication;
    }

    public int getId_formation() {
        return id_formation;
    }

    public void setId_formation(int id_formation) {
        this.id_formation = id_formation;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public Date getDate_publication() {
        return Date_publication;
    }

    public void setDate_publication(Date date_publication) {
        Date_publication = date_publication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof formation)) return false;
        formation formation = (formation) o;
        return getId_formation() == formation.getId_formation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_formation());
    }

    @Override
    public String toString() {
        return "formation{" +
                "id_formation=" + id_formation +
                ", theme='" + theme + '\'' +
                ", descriptif='" + descriptif + '\'' +
                ", Date_publication=" + Date_publication +
                '}';
    }
}
