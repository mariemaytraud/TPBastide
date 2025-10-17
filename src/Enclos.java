import java.util.ArrayList;
import java.util.List;

public class Enclos {
    private String nom;
    private List<Animal> animaux;
    private double superficie;

    public Enclos(String nom, double superficie) {
        this.nom = nom;
        this.superficie = superficie;
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
        System.out.println(animal.getNom() + " a été ajouté à l'enclos " + nom);
    }

    public void retirerAnimal(Animal animal) {
        animaux.remove(animal);
        System.out.println(animal.getNom() + " a été retiré de l'enclos " + nom);
    }

    public void nourrirAnimaux() {
        for (Animal animal : animaux) {
            animal.manger();
        }
    }

    public void afficherAnimaux() {
        System.out.println("Animaux dans l'enclos " + nom + ":");
        for (Animal animal : animaux) {
            System.out.println("- " + animal.getNom() + " (" + animal.getClass().getSimpleName() + ")");
        }
    }
}