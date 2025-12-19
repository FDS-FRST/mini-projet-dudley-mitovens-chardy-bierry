//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenue dans le jeu de combat !");
        System.out.print("Joueur 1, entre ton nom : ");
        String nomJoueur1 = scanner.nextLine();
        Joueur joueur1 = new Joueur(nomJoueur1);
        System.out.print("Joueur 2, entre ton nom : ");
        String nomJoueur2 = scanner.nextLine();
        Joueur joueur2 = new Joueur(nomJoueur2);
        System.out.println();


        System.out.println(joueur1.getNom() + ", crée ton équipe de  3 personages.");
        Personnage[] equipeJoueur1 = new Personnage[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Nom du personnage " + (i + 1) + " : ");
            String nomPersonnage = scanner.nextLine();
            Personnage personnageJ1 = new Personnage(nomPersonnage);
             joueur1.getEquipe()[i] = personnageJ1;  
        }
        System.out.println();

       
//l'equipe du joueur 2
        System.out.println("\n " + nomJoueur2 + ", cree ton equipe de 3 personnage : ");
        Personnage[] equipeJoueur2 = new Personnage[3];
        for (int i =0; i <3; i++){
            System.out.print(" Nom du Personnage " + (i+1) + ":");
            String nompersonnage = scanner.nextLine();
            Personnage personnageJ2 = new Personnage(nompersonnage);
             joueur2.getEquipe()[i] = personnageJ2;
        }
        System.out.println();

int tour = 1;
        // Boucle de jeu
        while (joueur1. aEncoreDesPersonnagesVivants () && joueur2.aEncoreDesPersonnagesVivants () ) {
            System.out.println("\n ----- Tour " + tour + "--- ");
            // Tour du Joueur 1
           Personnage attaquant1 = joueur1.choisirPersonnageVivant(scanner);// Besoin dans cette definiee, un system out qui va permettre au joueur de choisir son personnage, bien sur avec le numero dedans.
            System.out.println(joueur1.getNom() + " attaque !");
           System.out.print("Choisis une cible chez " + joueur2.getNom() + " (1-3) : ");
            int cible1 = scanner.nextInt();
            scanner.nextLine(); 
            Personnage adversaire1 = (joueur2.getEquipe()[cible1 - 1]);
            attaquant1.attaquer(adversaire1);
            joueur2.afficherEquipe();
            if (!joueur2.aEncoreDesPersonnagesVivants()) break;

            // tour Joueur 2
            Personnage attaquant2 = joueur2.choisirPersonnageVivant(scanner); 
            System.out.println(joueur2.getNom() + " attaque !");
            System.out.print("Choisis une cible chez " + joueur1.getNom() + " (1-3) : ");
            int cible2 = scanner.nextInt(); 
            scanner.nextLine();
            Personnage adversaire2 = joueur1.getEquipe()[cible2 - 1];
            attaquant2.attaquer(adversaire2);
            joueur1.afficherEquipe();
            tour++;
    
        }        // Fin du jeu
        if (joueur1.aEncoreDesPersonnagesVivants()) {
            System.out.println("\n " + joueur1.getNom() + " a gagné la partie !");
        } else {
            System.out.println("\n " + joueur2.getNom() + " a gagné la partie !");
        }
        System.out.println("\n Le jeu est terminé !");



scanner.close();

}}