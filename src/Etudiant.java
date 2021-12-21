public class Etudiant {
    String prenom;
    String nom;
    double moyenne;

    public Etudiant(String prenom, String nom, double moyenne) {
        this.prenom = prenom;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

}
