package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ma.education.tp1.introduction.Salle;

public class TestReflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        Class cls = Class.forName("ma.education.tp1.introduction.Salle");

        // Display fields
        Field[] fields = cls.getDeclaredFields();
        System.out.println("The fields:");
        for (Field f:fields) {
            System.out.println(f.getName());
        }

        // Display methods
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("The methods:");
        for (Method m:methods) {
            System.out.println(m.getName());
        }

        // Instanciate objects
        Constructor[] constructors = cls.getDeclaredConstructors();

        Salle o1 = (Salle) constructors[0].newInstance();
        Salle o2 = (Salle) constructors[1].newInstance("Salle Informatique");
        Salle o3 = (Salle) constructors[2].newInstance(2, "Salle des cours");

        System.out.println(o1.id); // 0
        System.out.println(o1.nom); // null

        System.out.println(o2.id); // 0
        System.out.println(o2.nom); // Salle Informatique

        System.out.println(o3.id); // 2
        System.out.println(o3.nom); // Salle de cours


        System.out.println(o2.equals(o3));
    }
}
