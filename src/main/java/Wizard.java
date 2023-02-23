public class Wizard extends BaseHero {
    private int maxMp;
    private int mp = 200;

    public Wizard() {
        super(String.format("I am an Wizard"), 200, 2);
        this.maxMp = 200;
        this.mp = maxMp;;
    }

    public String getInfo() {
        return String.format("%s MP: %d Type: %s", super.getInfo(), this.mp, this.getClass().getSimpleName());
    }
}