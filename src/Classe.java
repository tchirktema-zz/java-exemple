import java.util.ArrayList;

public class Classe {
    ArrayList<Etudiant> tousLesEtudiants;
    ArrayList<Etudiant> etudiantsAdmins;
    ArrayList<Etudiant> etudiantsNonAdmis;

    public Classe() {
        this.tousLesEtudiants = new ArrayList<Etudiant>();
        this.etudiantsAdmins = new ArrayList<Etudiant>();
        this.etudiantsNonAdmis = new ArrayList<Etudiant>();
    }

    public void ajouter(Etudiant etudiant){
        this.tousLesEtudiants.add(etudiant);
    }

    public void deliberer(){
        this.tousLesEtudiants.forEach((etudiant) -> {
            if(etudiant.moyenne < 10){
                this.etudiantsNonAdmis.add(etudiant);
            }else {
                this.etudiantsAdmins.add(etudiant);
            }
        });
    }

    public void afficherAdmins(){
        this.etudiantsAdmins.forEach((etudiant) -> {
            System.out.println("Nom :"+ etudiant.nom+ " prenom: "+etudiant.prenom+ " moyenne: "+etudiant.moyenne);
        });
    }
}
