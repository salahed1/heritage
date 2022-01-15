package ma.education.tp1.introduction;

public class AccesSamePackage {
    public static void main(String[] args) {
        Salle s8 = new Salle("Salle A"); // Works with no errors

        // Display values
        System.out.println(s8.id); // output: 0
        System.out.println(s8.nom); // output: Salle A
    }
}
