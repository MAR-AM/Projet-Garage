package Garage_project.src;

public class Voiture {
    private int id;
    private String matricule;
    private String marque;
    private String modele;
    private int annee;
    private Utilisateur proprietaire; // Association avec Utilisateur

    
    public Voiture(int id, String matricule, String marque, String modele, int annee, Utilisateur proprietaire) {
        this.id = id;
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.proprietaire = proprietaire;
    }

    public int getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getAnnee() {
        return annee;
    }

    public Utilisateur getProprietaire() {
        return proprietaire;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setProprietaire(Utilisateur proprietaire) {
        this.proprietaire = proprietaire;
    }

 
    public String toString() {
        return "Voiture { " +
                "id = " + id +
                ", matricule = '" + matricule + '\'' +
                ", marque = '" + marque + '\'' +
                ", modele = '" + modele + '\'' +
                ", annee = " + annee +
                ", proprietaire = " + (proprietaire != null ? proprietaire.getNom() + " " + proprietaire.getPrenom() : "Aucun") +
                " }";
    }
}
