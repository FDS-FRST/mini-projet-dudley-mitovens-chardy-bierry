// Création de la classe Personnage
public class Personnage {
    private int vie;
    private int attaque;
    private String nom;

    // Constructeur complet
    public Personnage(String nom, int vie, int attaque) {
        this.nom = nom; //non an met rete konsa paske moun se sel la nap ba li posibilite poul bay non li vle a pesonaj li yo
        this.vie = vie;// vi dwe tou monte a 100 bro paske se li menm tout jwe ap itilize. 
        this.attaque = attaque;// sa dwe inisialize tou ak 20 bro paske se li menm tout jwe ap itilize.
    }

    // Constructeur alternatif
    public Personnage(String nom) {
        this.nom = nom;
        this.vie = 100;   // valeur par défaut
        this.attaque = 20; // valeur par défaut
    }

    public Personnage(String nom, int vie) {
        this.nom = nom;                             //nou pa bezwen mete non an nan constructor alternatif la paske nou vle ke jwe a ka bay non li vle a.
        this.vie = vie;
        this.attaque = 0; // valeur par défaut
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

            // la vie ne peut etre egale a zero
            //cible.vie = cible.vie - this.attaque;  // par le fait que vie est private, on ne peut pas y acceder directement depuis une autre instance et aussi l'utilisation de la methode defenre fait deja le travail.
            // lem kite kitel, li retire 2 fwa na vi an epi tou,li pa respekte regle ki di vi pa dwe negatif.
            System.out.println (cible.nom + "perd" + this.attaque + "points de vie !");// nou pap bezwen sa paske metod defendre lan genyenl deja, vin fe gen de repetisyon nan afichaj la.
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