import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private List<Enclos> enclos;

    public Zoo(String nom) {
        this.nom = nom;
        this.enclos = new ArrayList<>();
    }

    public void ajouterEnclos(Enclos enclos) {
        this.enclos.add(enclos);
        System.out.println("Nouvel enclos ajouté au zoo " + nom);
    }

    public void nourrirTousLesAnimaux() {
        System.out.println("Nourrissage des animaux dans le zoo " + nom);
        for (Enclos e : enclos) {
            e.nourrirAnimaux();
        }
    }

    public void afficherEnclos() {
        System.out.println("Liste des enclos du zoo " + nom + ":");
        for (Enclos e : enclos) {
            e.afficherAnimaux();
        }
    }
}