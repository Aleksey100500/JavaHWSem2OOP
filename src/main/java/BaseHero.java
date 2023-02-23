import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class BaseHero implements Interface{

    private String nameHero;
    private int MaxHp;
    private int hp;
    private int speed;

    private static final Random rand = new Random();

    public BaseHero(String nameHero, int hp, int speed) {
        this.nameHero = nameHero;
        this.hp = hp;
        this.MaxHp = hp;
        this.speed = speed;
    }
    public String getInfo() {
        return String.format("Name: %s HP: %d Speed: %d",
                this.nameHero, this.hp, this.speed);
    }

    public void Step(int step) {
        int newStep = BaseHero.rand.nextInt(0, step);
        System.out.printf("%s, walked %d steps\n", this.nameHero, newStep);
    }
    public void getDamage(int damage, BaseHero target) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else {
            System.out.println(target.Die(target));
        }

    }
    public String Die(BaseHero target) {
        target = new ClearHero();
        System.out.printf("%s hero was KILLED...\n\n", this.getClass().getSimpleName());
        return target.getInfo();
    }

    public void Attack (BaseHero target) {
        int damage = 200;
        System.out.printf("%s attacked and %s received %d damage.\n",
                this.getClass().getSimpleName(), target.getClass().getSimpleName(), damage);
        target.getDamage(damage, target);
    }

    public ArrayList<BaseHero> createTeam(ArrayList<BaseHero> team1 ,int hero1, int hero2, int hero3) {
        ArrayList<BaseHero> team = new ArrayList<>();
        if (hero1 == 1 && hero2 == 2 && hero3 == 3) {
            team.add(new Priest());
            team.add(new Druid());
            team.add(new Warior());
        } else if (hero1 == 4 && hero2 == 5 && hero3 == 6) {
            team.add(new Sniper());
            team.add(new Wizard());
            team.add(new Krestyanin());
        }
        return team;
    }
}
