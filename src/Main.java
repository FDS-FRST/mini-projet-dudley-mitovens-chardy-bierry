//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenue dans le Jeu de Combat !");
        System.out.print("Joueur 1, entre ton nom : ");
        String nomJoueur1 = scanner.nextLine();
        Joueur joueur1 = new Joueur(nomJoueur1);
        System.out.print("Joueur 2, entre ton nom : ");
        String nomJoueur2 = scanner.nextLine();
        Joueur joueur2 = new Joueur(nomJoueur2);
        System.out.println();


        System.out.println(joueur1.getNom() + ", crée ton équipe, choisis 3 personages.");
        Personnage[] equipeJoueur1 = new Personnage[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Nom du personnage " + (i + 1) + " : ");
            String nomPersonnage1 = scanner.nextLine();
            Personnage personnage = new Personnage(nomPersonnage1);
            equipeJoueur1[i] = personnage;

        }
        for (Personnage personnage : equipeJoueur1) {
          System.out.println();
            System.out.println(personnage);
        }

        //l'equipe du joueur 2
        System.out.println("\n " + nomJoueur2 + ", crée ton équipe choisi 3 personnages : ");
        Personnage[] equipeJoueur2 = new Personnage[3];
        for (int i=0; i <3; i++){
            System.out.println(" Nom du Personnage " + (i+1) + ":");
            String nom = scanner.nextLine();
            equipeJoueur2[i] = new Personnage(nom,100,20);
        }
        for (Personnage personnage : equipeJoueur1) {
            System.out.println();
            System.out.println(personnage);
        }
        //on affiche maintenant les equipes
        System.out.println();
        System.out.println("équipes créés avec succès");



        int tour = 1;
        while (joueur1. aEncoreDesPersonnagesVivants () && joueur2.aEncoreDesPersonnagesVivants () ) {
            System.out.println("\n ----- Tour " + tour + "--- ");
            // Tour du Joueur 1
           // Personnage attaquant1 = joueur1.choisirPersonnageVivant(scanner);
            System.out.println(joueur1.getNom() + " attaque !");
            joueur2.afficherEquipe();
            System.out.print("Choisis une cible chez " + joueur2.getNom() + " (1-3) : ");
            int cibleIndex1 = scanner.nextInt();
            scanner.nextLine();
            //Personnage cible1 = joueur2.getNom(cibleIndex1 - 1);
            //attaquant1.attaquer(cible1);
            joueur2.afficherEquipe();

            if (!joueur2.aEncoreDesPersonnagesVivants()) break;

            System.out.println();
            System.out.println("État de l'équipe");
            joueur2.afficherEquipe();


            // tour Joueur 2
            Personnage attaquant2 = joueur2.choisirPersonnageVivant();
            System.out.println(joueur2.getNom() + " attaque !"); // Mitovens eskew we erreur sa ?
            joueur1.afficherEquipe();
            System.out.print("Choisis une cible chez " + joueur1.getNom() + " (1-3) : ");
            int cibleIndex2 = scanner.nextInt();
            scanner.nextLine();
           // Personnage cible2 = joueur1.getPersonnage(cibleIndex1 - 1);
            //attaquant2.attaquer(cible2);
            joueur1.afficherEquipe();

            if (!joueur2.aEncoreDesPersonnagesVivants()) break;


            System.out.println();
            System.out.println("État de l'équipe");
            joueur1.afficherEquipe();


        }
        .
    }
}


