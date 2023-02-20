import java.util.Random;

public abstract class BaseHero implements Interface{

    private String nameHero;
    private int MaxHp;
    private int hp;

    public BaseHero(String nameHero, int hp) {
        this.nameHero = nameHero;
        this.hp = hp;
        this.MaxHp = hp;
    }
    public String getInfo() {
        return String.format("Name: %s HP: %d",
                this.nameHero, this.hp);
    }

    public void Step(int step) {
        int newStep = new Random().nextInt(0, step);
        System.out.printf("%s, walked %d steps\n", this.nameHero, newStep);
    }
}
