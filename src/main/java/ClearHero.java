public class ClearHero extends BaseHero {
    private int mp;
    private int maxMp;

    public ClearHero() {
        super(String.format("I am an Perished"), 0, 0, 0, 0, 0, 0);
        this.maxMp = 0;
        this.mp = maxMp;
    }

    public String getInfo() {
        return String.format("%s MP: %d Type: %s\n", super.getInfo(), this.mp, this.getClass().getSimpleName());
    }
}