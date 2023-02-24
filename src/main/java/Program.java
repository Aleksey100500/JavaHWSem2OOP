import java.util.*;

public class Program {

    public static void main(String[] args) {

        BaseHero hero_1 = new Priest();
        System.out.println(hero_1.getInfo());

        BaseHero hero_2 = new Druid();
        System.out.println(hero_2.getInfo());

        BaseHero hero_3 = new Warior();
        System.out.println(hero_3.getInfo());

        BaseHero hero_4 = new Sniper();
        System.out.println(hero_4.getInfo());

        BaseHero hero_5 = new Wizard();
        System.out.println(hero_5.getInfo());

        BaseHero hero_6 = new Krestyanin();
        System.out.println(hero_6.getInfo());

        hero_1.Step(10);
        hero_2.Step(10);
        hero_3.Step(10);
        hero_4.Step(10);
        hero_1.Attack(hero_2);

        ArrayList<BaseHero> listHero1 = new ArrayList<>();
        ArrayList<BaseHero> listHero2 = new ArrayList<>();
        createList(listHero1);
        createList(listHero2);

        for ( BaseHero hero : listHero1 ) {
            System.out.println(hero.getInfo());
        }
        System.out.println("\n\n");

        for ( BaseHero hero : listHero2 ) {
            System.out.println(hero.getInfo());
        }

        System.out.println("\n\n");

        listHero1.addAll(listHero2);
        listHero1.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        for ( BaseHero hero : listHero1 ) {
            System.out.println(hero.getInfo());
        }
    }

    public static ArrayList<BaseHero> createList(ArrayList team) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(1,6);
            switch (num) {
                case 1:
                    team.add(new Priest());
                    break;
                case 2:
                    team.add(new Druid());
                    break;
                case 3:
                    team.add(new Warior());
                    break;
                case 4:
                    team.add(new Sniper());
                    break;
                case 5:
                    team.add(new Wizard());
                    break;
                case 6:
                    team.add(new Krestyanin());
                    break;
            }
        }
        return team;
    }
}
