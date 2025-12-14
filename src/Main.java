//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Bienvenue dans le jeu de combat !");
// Pa bliye input se pou ajoute yon vale ki dwe asigne ak yon objet de yon klas
System.out.print("Joueur 1, entre ton nom : ");
// pou ke non jwe an stoke, nou dwe kreye yon new personnage de klas personnage lan ki ap gen non jouer1;
// String nom = input.nextLine(); liy sa se li menm ki ap setup le nou kreye klas yo;
// Joueur jouer1= new Joueur(nom); menm bagay ak liy anwo a;
String joueur1 = scanner.nextLine();// liy sa ap retire le klas yo kreye;
System.out.print("Joueur 2, entre ton nom : ");
// mennm bagay pou jwe 2 a;  
  // pou ke non jwe an stoke, nou dwe kreye yon new personnage de klas personnage lan ki ap gen non jouer1;
// String nom = input.nextLine(); liy sa se li menm ki ap setup le nou kreye klas yo;
// Joueur jouer2= new Joueur(nom); menm bagay ak liy anwo a; 
String joueur2 = scanner.nextLine();// liy sa ap retire le klas yo kreye;
// joueur 1 an dwe change en getname de klas joueur  lan pou nou ka itilize non li nan tout jwèt la;
  scanner.close();  





























       // Création d'un personnage avec le constructeur complet
                Personnage guerrier = new Personnage("Chardy", 100, 25);

                // Création d'un personnage avec le constructeur alternatif (attaque par défaut = 0)
                Personnage mage = new Personnage("Bierry", 80);

                // Affichage des informations
                System.out.println("=== Personnage 1 ===");
                System.out.println("Nom : " + guerrier.getNom());
                System.out.println("Vie : " + guerrier.getVie());
                System.out.println("Attaque : " + guerrier.getAttaque());

                System.out.println("\n=== Personnage 2 ===");
                System.out.println("Nom : " + mage.getNom());
                System.out.println("Vie : " + mage.getVie());
                System.out.println("Attaque : " + mage.getAttaque());

                // Exemple de modification avec setter
                mage.setAttaque(15);
                System.out.println("\nAprès modification, attaque du mage : " + mage.getAttaque());
    }
}
