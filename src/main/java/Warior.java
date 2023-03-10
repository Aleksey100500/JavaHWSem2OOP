public class Warior extends BaseHero {
    private int maxEnergy;
    private int energy;

    public Warior() {
        super(String.format("I am an Warior"), 200, 5,
                Warior.rand.nextInt(30,50), 10, 10,2 );
        this.maxEnergy = 200;
        this.energy = maxEnergy;
    }


    public String getInfo() {
        return String.format("%s MP: %d Type: %s", super.getInfo(), this.energy, this.getClass().getSimpleName());
    }
}
