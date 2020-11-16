package HW09modul2;


public class Starter {
    public static void main(String[] args) {
        Vodka vodka = new Vodka(100);
        Cola cola = new Cola(100);
        Energiser energiser = new Energiser(100);
        OrangeJuice orangeJuice = new OrangeJuice(200);
        Campari campari = new Campari(100);
        SparklingWater sparklingWater = new SparklingWater(200);
        Milk milk = new Milk(200);
        CoffeeLiquor coffeeLiquor = new CoffeeLiquor(100);


        Cocktail disko = new Cocktail("Disco", cola, energiser);
        Cocktail whiteRussian = new Cocktail("White russian", milk, vodka, coffeeLiquor);
        Cocktail sparklingCampariOrange = new Cocktail("Sparkling Campari Orange", sparklingWater, orangeJuice, campari);
        Cocktail milkShake = new Cocktail("Milkshake", milk, sparklingWater);
        Cocktail myCreation = new Cocktail("MyCreation", new Vodka(50), new Milk(200), new SparklingWater(50));

        Cocktail[] bar = new Cocktail[]{disko, whiteRussian, sparklingCampariOrange, milkShake, myCreation};
        for (Cocktail cocktail : bar) {
            System.out.println(cocktail);
            System.out.println();
        }
    }
}


