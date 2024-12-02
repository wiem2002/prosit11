public class Main {
    public static void main(String[] args) {
        AffectationHashMap gestion = new AffectationHashMap();

        Employe e1 = new Employe(1, "Alice");
        Employe e2 = new Employe(2, "Bob");
        Employe e3 = new Employe(3, "Charlie");

        Departement d1 = new Departement("IT");
        Departement d2 = new Departement("Finance");


        gestion.ajouterEmployeDepartement(e1, d1);
        gestion.ajouterEmployeDepartement(e2, d2);
        gestion.ajouterEmployeDepartement(e3, d1);


        System.out.println("Affectations initiales :");
        gestion.afficherEmployesEtDepartements();


        gestion.ajouterEmployeDepartement(e1, d2);
        System.out.println("\nAprès avoir changé le département d'Alice :");
        gestion.afficherEmployesEtDepartements();


        gestion.supprimerEmploye(e3);
        System.out.println("\nAprès avoir supprimé Charlie :");
        gestion.afficherEmployesEtDepartements();


        System.out.println("\nRecherche d'employés et départements :");
        System.out.println("Bob existe ? " + gestion.rechercherEmploye(e2));
        System.out.println("Département IT existe ? " + gestion.rechercherDepartement(d1));

        
        System.out.println("\nAffectations triées :");
        gestion.trierMap().forEach((employe, departement) ->
                System.out.println(employe + " est affecté à " + departement));
    }
}
