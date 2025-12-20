import java.util.Scanner;

public class Joueur {
    //                ATTRIBUTS
    // Caractéristiques du joueur
    private String nom;
    private Personnage[] equipe;

public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Personnage[] getEquipe() {
    return equipe;
    }
public void setEquipe(Personnage[] equipe) {
        this.equipe = equipe;
    }


    //                 CONSTRUCTEUR
    // Crée un nouveau joueur avec son nom
    public Joueur(String nom) {
        this.nom = nom;
        this.equipe = new Personnage[3]; 
    }
    //                  MÉTHODE 1
    public Personnage choisirPersonnageVivant(Scanner scanner) {
        for (Personnage personnage1  : equipe) {                        //Manque de coonditions pour verifier le choix du personnage, a haque j'entre un numero ou lettre , le programme s'arrete.
            if (personnage1 != null && personnage1.estVivant()) {       // Manque de conditon pour verifier si le personnage est a zero pour qu'il ne soit pas choisi.
                return personnage1;
            }
        }
        return null;  // Aucun personnage vivant
    }
    //                   METHODE 2
    public boolean aEncoreDesPersonnagesVivants() {
        // Cherche au moins un personnage vivant
        for (Personnage p : equipe) {
            if (p != null && p.estVivant()) {
                return true;
            }
        }
        return false;
    }
    // Affiche tous les personnages de l'équipe
    public void afficherEquipe() {
        System.out.println("Équipe de " + this.nom + ":");
        // Affiche chaque personnage qui existe
        for (Personnage p : this.equipe) {      // method sa manke yon paramet ki ta dwe afiche pesonaj ekip yo ak nimero nomalman, pou fasilite chwa yo.
            if (p != null) {
                p.afficherEtat();
            }
        }
    }
}
r