import java.util.Scanner;

public class Joueur {
    //                ATTRIBUTS
    // Caractéristiques du joueur
    private String nom;
    private Personnage[] equipe;

public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Personnage[] getEquipe() {
    return equipe;
    }
public void setEquipe(Personnage[] equipe) {
        this.equipe = equipe;
    }


    //                 CONSTRUCTEUR
    // Crée un nouveau joueur avec son nom
    public Joueur(String nom) {
        this.nom = nom;
        this.equipe = new Personnage[3]; 
    }
    //                 METHODES 1
    public Personnage choisirPersonnageVivant(Scanner scanner) {
    while (true) {
        System.out.print(this.nom + ", choisis le numéro de ton attaquant (1-3) : ");
        String entreUtilisateur = scanner.nextLine().trim();  
        
        try {
            int choix = Integer.parseInt(entreUtilisateur);
            int index = choix - 1;
            
        
            if (choix < 1 || choix > 3) {
                System.out.println(" Choix invalide ! Entre 1, 2 ou 3.");
                continue;
            }
            
            if (equipe[index] == null) {
                System.out.println("Ce personnage n'existe pas !");
                continue;
            }
            
            if (!equipe[index].estVivant()) {
                System.out.println(" Ce " + equipe[index].getNom() + " est mort !");
                continue;
            }
            
            return equipe[index];
            
        } catch (NumberFormatException e) {
            System.out.println(" Erreur : Tu dois entrer un chiffre (1, 2 ou 3) !");
        }
        }
    }
 
    //                   METHODE 2
    public boolean aEncoreDesPersonnagesVivants() {
        // Cherche au moins un personnage vivant
        for (Personnage p : equipe) {
            if (p != null && p.estVivant()) {
                return true;
            }
        }
        return false;
    }
    // Affiche tous les personnages de l'équipe
    public void afficherEquipe() {
        System.out.println("Équipe de " + this.nom + ":");
        // Affiche chaque personnage qui existe
        for (int i = 0; i < equipe.length; i++) {
            Personnage p = equipe[i];
            if (p != null) {
                System.out.println((i + 1) + ". " + p.getNom() + " - "+ p.getVie() + " HP");
            }
            else {
                System.out.println((i + 1) + ". n'existe pas");
            }
        }
    }
}

