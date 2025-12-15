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


        System.out.println(joueur1 + ", cree ton equipe de  3 pesonnages.");
// nan plas nou dwe mete "input" pou nou ka pran valeur ke jwe 1 an ap antre a;
        System.out.print("Nom du personnage 1 : ");
// Nou dwe kreye yon objet ki gen pou non nomPersonnage1 ki ap pran valeur ke jwe 1 an ap antre a;
// String nom = input.nextLine(); se li menm ki ap setup le nou kreye klas joueur pou sa li menm yo;
// Personnage personnage1 = new Personnage(nom); menm bagay ak liy anwo a;
        String nomPersonnage1 = scanner.nextLine(); //li sa ap retire le klas yo kreye;
        System.out.print("Nom du personnage 2 : ");
//Menm pou personnage 2 a;
// String nom = input.nextLine(); se li menm ki ap setup le nou kreye klas joueur pou sa li menm yo;
// Personnage personnage2 = new Personnage(nom); menm bagay ak liy anwo a
        String nomPersonnage2 = scanner.nextLine();//liy sa ap retire le klas yo kreye;
        System.out.print("Nom du personnage 3 : ");
//Menm pou personnage 3 a;
// String nom = input.nextLine(); se li menm ki ap setup le nou kreye klas joueur pou sa li menm yo;
// Personnage personnage3 = new Personnage(nom); menm bagay ak liy anwo a
        String nomPersonnage3 = scanner.nextLine();//liy sa ap retire le klas yo kreye;


        // Modification de la classe Jeu (Main)
        // nap we Joueur mwen an rouge paskel pa we class Joueur an
        //public class Jeu {
        // public static void main(String[] args){System.out.println ("Bienvenue dans le Jeu de Combat ! ");
        // System.out.print("Joueur 1, entre ton nom : ");
        //  String nomJ1 = scanner.nextLine ();
        //Joueur joueur1 = new Joueur (nomJ1, scanner );

        // System.out.println ("Joueur 2, entre ton nom : ")
        // String nomJ2 = scanner.nextLine ();
        //Joueur joueur2 = new Joueur (nomJ2 , scanner );

                // Exemple de modification avec setter
               
                
    }
}