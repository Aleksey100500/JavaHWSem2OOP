public class Druid extends BaseHero {
    private int maxMp;
    private int mp = 200;

    public Druid() {
        super(String.format("I am an Druid"), 200, 4,
                Druid.rand.nextInt(10,25), 7, 1,3);
        this.maxMp = 200;
        this.mp = maxMp;;
    }

    public String getInfo() {
        return String.format("%s MP: %d Type: %s", super.getInfo(), this.mp, this.getClass().getSimpleName());
    }
}
