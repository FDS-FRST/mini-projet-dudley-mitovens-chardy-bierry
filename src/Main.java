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
        System.out.print("Nom du personnage 1 : ");
        String nomPersonnage1 = scanner.nextLine();
        Personnage personnage1 = new Personnage(nomPersonnage1);
        System.out.print("Nom du personnage 2 : ");
        String nomPersonnage2 = scanner.nextLine();
        Personnage personnage2 = new Personnage(nomPersonnage2);
        System.out.print("Nom du personnage 3 : ");
        String nomPersonnage3 = scanner.nextLine();
        Personnage personnage3 = new Personnage(nomPersonnage3);
        System.out.println();

        System.out.println(joueur2.getNom() + ", cree ton equipe de  3 pesonnages.");
        System.out.print("Nom du personnage 1 : ");
        String nomPersonnage4 = scanner.nextLine();
        Personnage personnage4 = new Personnage(nomPersonnage4);
        System.out.print("Nom du personnage 2 : ");
        String nomPersonnage5 = scanner.nextLine();
        Personnage personnage5 = new Personnage(nomPersonnage5);
        System.out.print("Nom du personnage 3 : ");
        String nomPersonnage6 = scanner.nextLine();
        Personnage personnage6 = new Personnage(nomPersonnage6);
        System.out.println();
     
         scanner.close();       
    }
}