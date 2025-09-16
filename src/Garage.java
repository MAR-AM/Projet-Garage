package Garage_project.src;


public class Garage {
    private int id;
    private String nom;
    private String adresse;
    private String telephone;

    public Garage(int id, String nom, String adresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String toString() {
        return "Garage { " +
                "id = " + id +
                ", nom = '" + nom + '\'' +
                ", adresse = '" + adresse + '\'' +
                ", telephone = '" + telephone + '\'' +
                " }";
    }
}