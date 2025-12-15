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
            String nomPersonnage1 = scanner.nextLine();
            Personnage personnage = new Personnage(nomPersonnage1);
            equipeJoueur1[i] = personnage;

        }
        for (Personnage personnage : equipeJoueur1) {
          System.out.println();
            System.out.println(personnage);
        }
}

// System.out.println("Bienvenue dans le Jeu de Combat !")
   /* System.out.print("Joueur 1, entre ton nom : ");
        String nomJ1 = scanner.nextLine();
        Joueur joueur1 = new Joueur(nomJ1, scanner);

        System.out.print("Joueur 2, entre ton nom : ");
        String nomJ2 = scanner.nextLine();
        Joueur joueur2 = new Joueur(nomJ2, scanner); */

    /* Int tour = 1;
    while (joueur1. aEncoreDesPersonnagesVivants () && joueur2.aEncoreDesPersonnesVivants ()){
      System.out.println ("\n ----- Tour " + tour " --- ");

      // Tour du Joueur 1
         Personnage attaquant1 = joueur1.chosirPersonnageVivant (Scanner);
         System.out.println(joueur1.getNom() + " attaque !");
            joueur2.afficherEquipe();
            System.out.print("Choisis une cible chez " + joueur2.getNom() + " (1-3) : ");
            int cibleIndex1 = scanner.nextInt();
            scanner.nextLine();
            Personnage cible1 = joueur2.getPersonnage(cibleIndex1 - 1);
            attaquant1.attaquer(cible1);
            joueur2.afficherEquipe();

            if (!joueur2.aEncoreDesPersonnagesVivants()) break;

    }
     nou ka fe de meme pou Tour 2 an.

     */




}


