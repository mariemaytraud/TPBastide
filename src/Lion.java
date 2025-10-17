public class Lion extends Animal {
    private boolean estChefMeute;

    public Lion(String nom, int age, double poids, boolean estChefMeute) {
        super(nom, age, poids);
        this.estChefMeute = estChefMeute;
    }

    @Override
    public String faireDuBruit() {
        return "ROARRR!";
    }

    public void rugir() {
        System.out.println(getNom() + " rugit fortement : " + faireDuBruit());
    }

    public boolean estChefMeute() {
        return estChefMeute;
    }
}