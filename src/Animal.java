public abstract class Animal {
    private String nom;
    private int age;
    private double poids;

    public Animal(String nom, int age, double poids) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
    }

    public abstract String faireDuBruit();

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public double getPoids() {
        return poids;
    }

    public void manger() {
        System.out.println(nom + " mange sa nourriture.");
    }

    public void dormir() {
        System.out.println(nom + " dort paisiblement.");
    }
}