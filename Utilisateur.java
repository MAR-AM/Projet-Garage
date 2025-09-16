package Garage_project.src;

public class Utilisateur {
    private int id_utilisateur;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    // Constructeur
    public Utilisateur(int id_utilisateur, String nom, String prenom, String email, String telephone) {
        this.id_utilisateur = id_utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    // Getters
    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    // Setters
    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

   
    public String toString() {
        return "Utilisateur { " +
                "id_utilisateur = " + id_utilisateur +
                ", nom = '" + nom + '\'' +
                ", prenom = '" + prenom + '\'' +
                ", email = '" + email + '\'' +
                ", telephone = '" + telephone + '\'' +
                " }";
    }
}
