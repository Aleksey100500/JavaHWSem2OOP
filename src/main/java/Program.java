import java.util.*;

public class Program {

    public static void main(String[] args) {

        ArrayList<BaseHero> listHero1 = new ArrayList<>();
        ArrayList<BaseHero> listHero2 = new ArrayList<>();
        createList(listHero1);
        createList(listHero2);

        for ( BaseHero hero : listHero1 ) {
            System.out.println(hero.getInfo());
        }
        delimiter();

        for ( BaseHero hero : listHero2 ) {
            System.out.println(hero.getInfo());
        }
        delimiter();

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

    public static void delimiter() {
        String del = "#";
        for (int i = 0; i < 70; i++) {
            System.out.printf("%s", del);
        }
        System.out.println("\n");
    }
}
