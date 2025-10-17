public class Main {
    public static void main(String[] args) {
        // Création du zoo
        Zoo monZoo = new Zoo("Zoo de Marie");

        // Création des enclos
        Enclos enclosLions = new Enclos("Territoire des Lions", 1000);
        Enclos enclosSinges = new Enclos("La Forêt des Singes", 800);

        // Ajout des enclos au zoo
        monZoo.ajouterEnclos(enclosLions);
        monZoo.ajouterEnclos(enclosSinges);

        // Création des animaux
        Lion simba = new Lion("Simba", 5, 190.5, true);
        Lion nala = new Lion("Nala", 4, 160.2, false);
        Singe kong = new Singe("Kong", 8, 100.0, "Gorille");
        Singe cheeta = new Singe("Paf", 4, 45.5, "Chimpanzé");

        // Ajout des animaux dans leurs enclos
        enclosLions.ajouterAnimal(simba);
        enclosLions.ajouterAnimal(nala);
        enclosSinges.ajouterAnimal(kong);
        enclosSinges.ajouterAnimal(cheeta);

        // Démonstration des fonctionnalités
        System.out.println("\n=== État du zoo ===");
        monZoo.afficherEnclos();

        System.out.println("\n=== Heure du repas ===");
        monZoo.nourrirTousLesAnimaux();

        System.out.println("\n=== Animations ===");
        simba.rugir();
        kong.grimper();
    }
}