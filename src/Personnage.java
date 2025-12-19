// Création de la classe Personnage
public class Personnage {
    private int vie;
    private int attaque;
    private String nom;

    // Constructeur complet
    public Personnage(String nom, int vie, int attaque) {
        this.nom = nom;
        this.vie = 100;       // vi toujou inisyalize a 100
        this.attaque = 20;    // attaque toujou inisyalize a 20
    }

    // Constructeur alternatif (nom seulement)
    public Personnage(String nom) {
        this.nom = nom;
        this.vie = 100;   // valeur par défaut
        this.attaque = 20; // valeur par défaut
    }

    // Constructeur alternatif (nom + vie)
    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = 20; // attaque par défaut
    }

    /** Accesseurs */
    public int getVie() { return vie; }
    public void setVie(int vie) { this.vie = vie; }

    public int getAttaque() { return attaque; }
    public void setAttaque(int attaque) { this.attaque = attaque; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    // Vérification si le personnage est toujours vivant
    public boolean estVivant() {
        return vie > 0;
    }

    // Méthode attaquer une autre personne
    public void attaquer(Personnage cible) {
        if (this.estVivant()) {
            cible.defendre(this.attaque);
        } else {
            System.out.println(this.nom + " est mort et ne peut pas attaquer !");
        }
    }

    // Nouvelle méthode : défendre
    public void defendre(int degats) {
        this.vie = Math.max(this.vie - degats, 0);
        System.out.println(nom + " perd " + degats + " points de vie !");
    }

    // Afficher l'état
    public void afficherEtat() {
        System.out.println(nom + " - " + vie + " HP");
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

    // Augmenter l'attaque
    public void augmenterAttaque(int points) {
        this.attaque += points;
        System.out.println(nom + " augmente son attaque de " + points + " !");
    }

    // Afficher toutes les infos
    public void afficherInfos() {
        System.out.println(this.toString());
    }

    // Redéfinition toString
    @Override
    public String toString() {
        return nom + " - Vie: " + vie + " HP - Attaque: " + attaque;
    }

    // Méthode statique : duel
    public static void duel(Personnage p1, Personnage p2) {
        while (p1.estVivant() && p2.estVivant()) {
            p1.attaquer(p2);
            if (p2.estVivant()) p2.attaquer(p1);
        }
        System.out.println("Le duel est terminé !");
    }
}