// creation de la classe Personnage
public class Personnage {
    private int vie;
    private int attaque;
    private String nom;

    // Constructeur complet
    public Personnage(String nom, int vie, int attaque) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
    }

    // Constructeur alternatif
    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = 100;
        this.attaque = 20; // valeur par défaut
    }

    /** Accesseurs */
    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //verification si le personnage est toujours vivant !!
    public boolean estVivant () {
        return vie >0;
    }
// methode attaque une autre personne
    public void attaquer (Personnage cible) {
        if (this.estVivant()) {

            // la vie ne peut etre egale a zero
            cible.vie = cible.vie - this.attaque;
            System.out.println (cible.nom + "perd" + this.attaque + "points de vie !");
        } else {
            System.out.println (this.nom + "est mort et ne peut pas attaquer !");
        }

    }
    public void afficherEtat() {
        System.out.println (nom + " - " + vie + "HP");
    }
    // Soigner un personnage
    public void soigner(int points) {
        if (estVivant()) {
            this.vie = Math.min(this.vie + points, 100); // limite max
            System.out.println(nom + " récupère " + points + " points de vie !");
        } else {
            System.out.println(nom + " est mort et ne peut pas être soigné !");
        }
    }

    // Afficher toutes les infos
    public void afficherInfos() {
        System.out.println(nom + " - Vie: " + vie + " HP - Attaque: " + attaque);
    }

}a