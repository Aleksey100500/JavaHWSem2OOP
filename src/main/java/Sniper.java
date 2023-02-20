public class Sniper extends BaseHero {
    private int maxEnergy;
    private int energy;

    public Sniper() {
        super(String.format("I am an Sniper"), 200);
        this.maxEnergy = 200;
        this.energy = maxEnergy;
    }


    public String getInfo() {
        return String.format("%s MP: %d Type: %s", super.getInfo(), this.energy, this.getClass().getSimpleName());
    }
}
