public class Priest extends BaseHero {
    private int mp;
    private int maxMp;

    public Priest() {
        super(String.format("I am an Priest"), 200);
        this.maxMp = 200;
        this.mp = maxMp;
    }

    public String getInfo() {
        return String.format("%s MP: %d Type: %s", super.getInfo(), this.mp, this.getClass().getSimpleName());
    }
}
