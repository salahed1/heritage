package ma.access;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {
    public AccesHorsPackage(String nom) {
        super(nom);
    }

    public void afficher(Salle s) {
        System.out.println(s.id);
        System.out.println(s.nom);
        System.out.println(id);
        System.out.println(nom);
    }

    public static void main(String[] args) {
        Salle s9 = new Salle("Salle B"); // Works but only when we make The constructor public

        // Display values
        System.out.println(s9.id); // output: 0
        System.out.println(s9.nom); // output: Salle B
    }
}
