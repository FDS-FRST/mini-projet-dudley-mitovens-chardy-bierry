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

        // équipe du joueur 1
        System.out.println(joueur1.getNom() + ", crée ton équipe de 3 personnages.");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nom du personnage " + (i + 1) + " : ");
            String nomPersonnage = scanner.nextLine();
            joueur1.getEquipe()[i] = new Personnage(nomPersonnage);
        }
        System.out.println();

        // équipe du joueur 2
        System.out.println("\n" + nomJoueur2 + ", crée ton équipe de 3 personnages : ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nom du personnage " + (i + 1) + " : ");
            String nomPersonnage = scanner.nextLine();
            joueur2.getEquipe()[i] = new Personnage(nomPersonnage);
        }
        System.out.println();

        System.out.println("\n Appuyer sur Entree pour commencer le combat...");
        scanner.nextLine();

        int tour = 1;
        // Boucle de jeu
        while (joueur1.aEncoreDesPersonnagesVivants() && joueur2.aEncoreDesPersonnagesVivants()) {
            System.out.println("\n----- Tour " + tour + " -----");

            // Tour du Joueur 1
            Personnage attaquant1 = joueur1.choisirPersonnageVivant(scanner);
            System.out.println(joueur1.getNom() + " attaque !");
            System.out.print("Choisis une cible chez " + joueur2.getNom() + " (1-3) : ");
            String saisie1 = scanner.nextLine();
            try {
                int cible1 = Integer.parseInt(saisie1);
                if (cible1 >= 1 && cible1 <= 3) {
                    Personnage adversaire1 = joueur2.getEquipe()[cible1 - 1];
                    attaquant1.attaquer(adversaire1);
                    joueur2.afficherEquipe();
                } else {
                    System.out.println("Choix invalide, entre un nombre entre 1 et 3.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée non valide, entre un nombre entre 1 et 3.");
                continue;
            }
            if (!joueur2.aEncoreDesPersonnagesVivants()) break;

            // Tour du Joueur 2
            Personnage attaquant2 = joueur2.choisirPersonnageVivant(scanner);
            System.out.println(joueur2.getNom() + " attaque !");
            System.out.print("Choisis une cible chez " + joueur1.getNom() + " (1-3) : ");
            String saisie2 = scanner.nextLine();
            try {
                int cible2 = Integer.parseInt(saisie2);
                if (cible2 >= 1 && cible2 <= 3) {
                    Personnage adversaire2 = joueur1.getEquipe()[cible2 - 1];
                    attaquant2.attaquer(adversaire2);
                    joueur1.afficherEquipe();
                } else {
                    System.out.println("Choix invalide, entre un nombre entre 1 et 3.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée non valide, entre un nombre entre 1 et 3.");
                continue;
            }

            tour++;
        }

        // Fin du jeu
        if (joueur1.aEncoreDesPersonnagesVivants()) {
            System.out.println("\n" + joueur1.getNom() + " a gagné la partie !");
        } else {
            System.out.println("\n" + joueur2.getNom() + " a gagné la partie !");
        }
        System.out.println("\nLe jeu est terminé !");

        scanner.close();
    }
}