package ma.education.tp1.introduction;

public class TestHeritage {
    public static void main(String[] args) {
        // Instanciate SalleCours objects
        Salle s1 = new SalleCours(1, "Salle 1", 20);
        SalleCours s2 = new SalleCours(2, "Salle 2", 20);
        SalleCours s3 = (SalleCours) s1; // This line needs a cast because s1 is of type "Salle"
        SalleCours s4 = s2;

        // Instanciate Laboratoire objects
        Salle s5 = new Laboratoire(2, "LABO", "CHIMIE");
        SalleCours s6 = new SalleCours(2, "Salle 2", 20);
        // SalleCours s7 = s5; this line will not be solved by a cast because the classes have no inheritance relation
        SalleCours s8 = s6;
    }
}
