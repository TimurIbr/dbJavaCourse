package homework.lab3;
import homework.lab3.HeroFactory.BasicHeroFactory;

/**
 * @author Timur Ibraev
 */



public class MainHeroes {
    public static void main(String[] args) {

        BasicHeroFactory heroFactory = new BasicHeroFactory();
        GameManager gameManager = new GameManager();
        gameManager.fight(heroFactory.createHero(), heroFactory.createHero());


//       Faker faker = new Faker();
//
//        String fact = faker.chuckNorris().fact();
//        String character = faker.gameOfThrones().character();
//
//        System.out.println(character);
//        System.out.println(fact);


        //todo finish this
       /* HeroFactory heroFactory = new HeroFactory();
        Hero hero1 =heroFactory.createHero();
        Hero hero2 =heroFactory.createHero();

        GameManager gameManager = new GameManager();
        gameManager.fight(hero1, hero2);*/

        //knight Boromir kicked King Arthur for 5 hp
        //knight Arthur kicked King Boromir for 4 hp
        //knight Boromir kicked King Arthur for 7 hp
        //knight Arthur kicked King Boromir for 3 hp

        // king Arthur has won the battle

    }
}
