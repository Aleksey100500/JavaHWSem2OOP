public class Sniper extends BaseHero {
    private int maxEnergy;
    private int energy;
    private int distance, projectile;

    public Sniper() {
        super(String.format("I am an Sniper"), 200, 2,
                Sniper.rand.nextInt(20,40), 5, 10, 3);
        this.maxEnergy = 200;
        this.energy = maxEnergy;
        this.distance = 8;
        this.projectile = 10;
    }


    public String getInfo() {
        return String.format("%s MP: %d Type: %s", super.getInfo(), this.energy, this.getClass().getSimpleName());
    }
}
