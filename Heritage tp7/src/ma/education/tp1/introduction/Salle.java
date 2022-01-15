package ma.education.tp1.introduction;

public class Salle {
    public long id;
    public String nom;

    public Salle() {}

    public Salle(String nom) {
        this.nom = nom;
    }

    public Salle(long id, String nom) {
        this(nom);
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salle salle = (Salle) o;
        return id == salle.id;
    }
}
