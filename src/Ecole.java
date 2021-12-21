public class Ecole {
    public static void main(String[] args){
        Etudiant etudiant1 = new Etudiant("toto","patric",19);
        Etudiant etudiant2 = new Etudiant("toto 2","patric 2",8);
        Etudiant etudiant3 = new Etudiant("toto 3","patric 3",11);
        Etudiant etudiant4 = new Etudiant("toto 4","patric 4",4);
        Etudiant etudiant5 = new Etudiant("toto 5","patric", 9);


        Classe classe = new Classe();
        classe.ajouter(etudiant1);
        classe.ajouter(etudiant2);
        classe.ajouter(etudiant3);
        classe.ajouter(etudiant4);
        classe.ajouter(etudiant5);

        classe.deliberer();
        classe.afficherAdmins();
    }
}
