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
        
        if (!scanner.hasNextInt()) { 
            System.out.println("Erreur : Entre un chiffre !"); // Verification de l'entrée, si ce n'est pas un chiffre, on affiche ce message
            continue;
        }

        int choix = scanner.nextInt();
        int index = choix - 1; 

        // Verification de la validité du choix et si le personnage est vivant
        if (index >= 0 && index < equipe.length && equipe[index] != null && equipe[index].estVivant()) {
            return equipe[index];
        } else {
            System.out.println("Personnage est mort ! Choisis un autre personnage vivant.");
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
                System.out.println((i + 1) + ". [Vide]");
            }
        }
    }
}

