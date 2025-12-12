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
    }
}