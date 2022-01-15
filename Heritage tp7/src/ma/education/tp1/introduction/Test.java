package ma.education.tp1.introduction;

public class Test {
    public static void main(String[] args) {
        // Instanciate Salle objects
        Salle o1 = new Salle();
        Salle o2 = new Salle("Salle Informatique");
        Salle o3 = new Salle(2, "Salle des cours");

        // Display values
        System.out.println(o1.id); // output: 0
        System.out.println(o1.nom); // output: null

        System.out.println(o2.id); // output: 0
        System.out.println(o2.nom); // output: Salle Informatique

        System.out.println(o3.id); // output: 2
        System.out.println(o3.nom); // output: Salle des cours
    }
}
