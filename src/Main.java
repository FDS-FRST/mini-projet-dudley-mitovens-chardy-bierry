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

      
        System.out.println(joueur1.getNom() + ", cree ton equipe de  3 pesonnages.");
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
}}

