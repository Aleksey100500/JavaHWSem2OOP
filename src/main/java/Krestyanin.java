public class Krestyanin extends BaseHero {
    private int maxMp;
    private int mp = 200;

    public Krestyanin() {
        super(String.format("I am an Krestyanin"), 200, 5,
                Krestyanin.rand.nextInt(15,20), 5, 1, 1);
        this.maxMp = 200;
        this.mp = maxMp;;
    }

    public String getInfo() {
        return String.format("%s MP: %d Type: %s", super.getInfo(), this.mp, this.getClass().getSimpleName());
    }
}