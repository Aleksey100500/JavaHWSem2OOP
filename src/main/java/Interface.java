import java.util.ArrayList;

public interface Interface {
    void Step(int step);
    String getInfo();
    ArrayList<BaseHero> createTeam(ArrayList<BaseHero> team1 ,int hero1, int hero2, int hero3);
}
