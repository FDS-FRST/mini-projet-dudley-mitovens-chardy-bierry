import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu de combat !\n");

        // Création des joueurs
        System.out.print("Joueur 1, entre ton nom : ");
        Joueur joueur1 = new Joueur(scanner.nextLine());

        System.out.print("Joueur 2, entre ton nom : ");
        Joueur joueur2 = new Joueur(scanner.nextLine());

        System.out.println();

        // Création des équipes
        creerEquipe(scanner, joueur1);
        creerEquipe(scanner, joueur2);

        int tour = 1;

        // Boucle de jeu
        while (joueur1.aEncoreDesPersonnagesVivants() && joueur2.aEncoreDesPersonnagesVivants()) {
            System.out.println("\n----- Tour " + tour + " -----");

            // Tour du joueur 1
            jouerTour(scanner, joueur1, joueur2);

            if (!joueur2.aEncoreDesPersonnagesVivants()) break;

            // Tour du joueur 2
            jouerTour(scanner, joueur2, joueur1);

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

    // Méthode pour créer une équipe
    private static void creerEquipe(Scanner scanner, Joueur joueur) {
        System.out.println(joueur.getNom() + ", crée ton équipe de 3 personnages :");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nom du personnage " + (i + 1) + " : ");
            joueur.getEquipe()[i] = new Personnage(scanner.nextLine());
        }
        System.out.println();
    }

    // Méthode pour gérer un tour d’attaque
    private static void jouerTour(Scanner scanner, Joueur attaquant, Joueur defenseur) {
        Personnage persoAttaquant = attaquant.choisirPersonnageVivant(scanner);
        System.out.println(attaquant.getNom() + " attaque !");
        System.out.print("Choisis une cible chez " + defenseur.getNom() + " (1-3) : ");

        String saisie = scanner.nextLine();
        try {
            int cible = Integer.parseInt(saisie);
            if (cible >= 1 && cible <= 3) {
                Personnage adversaire = defenseur.getEquipe()[cible - 1];
                persoAttaquant.attaquer(adversaire);
                defenseur.afficherEquipe();
            } else {
                System.out.println("Choix invalide, entre un nombre entre 1 et 3.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrée non valide, entre un nombre entre 1 et 3.");
        }
    }
}