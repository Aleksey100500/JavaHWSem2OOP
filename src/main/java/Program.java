import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

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


        Random rand = new Random();

//        List<BaseHero> listHero = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            int num = rand.nextInt(1,4);
//            switch (num) {
//                case 1:
//                    listHero.add(new Priest());
//                    break;
//                case 2:
//                    listHero.add(new Druid());
//                    break;
//                case 3:
//                    listHero.add(new Warior());
//                    break;
//                case 4:
//                    listHero.add(new Sniper());
//                    break;
//            }
//        }
//        for ( BaseHero hero : listHero) {
//            System.out.println(hero.getInfo());
//        }


//        team1.containsAll(team2);



    }
}
