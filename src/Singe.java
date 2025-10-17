public class Singe extends Animal {
    private String espece;

    public Singe(String nom, int age, double poids, String espece) {
        super(nom, age, poids);
        this.espece = espece;
    }

    @Override
    public String faireDuBruit() {
        return "Ouh ouh ah ah!";
    }

    public void grimper() {
        System.out.println(getNom() + " grimpe dans les arbres.");
    }

    public String getEspece() {
        return espece;
    }
}