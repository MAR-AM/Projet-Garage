package Garage_project.src;

import java.util.Date;

public class Intervention {
    private int id;
    private Date date;
    private String type;
    private double cout;
    private Voiture voiture;
    private Garage garage;

    public Intervention(int id, Date date, String type, double cout, Voiture voiture, Garage garage) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.cout = cout;
        this.voiture = voiture;
        this.garage = garage;
    }

    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public String getType() {
        return type;
    }
    public double getCout() {
        return cout;
    }
    public Voiture getVoiture() {
        return voiture;
    }
    public Garage getGarage() {
        return garage;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCout(double cout) {
        this.cout = cout;
    }
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
    public void setGarage(Garage garage) {
        this.garage = garage;
    }
    
    public String toString() {
        return "Intervention { " +
                "id = " + id +
                ", date = " + date +
                ", type = '" + type + '\'' +
                ", cout = " + cout +
                ", voiture = " + (voiture != null ? voiture.getMatricule() : "null") +
                ", garage = " + (garage != null ? garage.getNom() : "null") +
                " }";
    }
}

