package HW09modul2;

public class Ingredient {
    private String name;
    private int liquid;
    private int perCent;

    public int getLiquid() {
        return liquid;
    }

    public double amountOfAlcohol() {
        return liquid / 100.0 * perCent;
    }

    public Ingredient(String name, int liquid, int perCent) {
        this.name = name;
        this.liquid = liquid;
        this.perCent = perCent;
    }

    @Override
    public String toString() {
        return "\nIngredient{" +
                "name='" + name + '\'' +

                ", liquid=" + liquid +
                ", perCent=" + perCent +
                '}';
    }

}

class Vodka extends Ingredient {

    public Vodka(int liquid) {
        super("Vodka", liquid, 40);
    }
}

class Cola extends Ingredient {

    public Cola(int liquid) {
        super("Cola", liquid, 0);
    }
}

class Energiser extends Ingredient {

    public Energiser(int liquid) {
        super("Red Bull", liquid, 0);
    }
}

class OrangeJuice extends Ingredient {

    public OrangeJuice(int liquid) {
        super("Orange juice", liquid, 0);
    }
}

class Campari extends Ingredient {

    public Campari(int liquid) {
        super("Campari", liquid, 28);
    }
}

class SparklingWater extends Ingredient {

    public SparklingWater(int liquid) {
        super("Sparkling water", liquid, 0);
    }
}

class Milk extends Ingredient {

    public Milk(int liquid) {
        super("milk", liquid, 0);
    }
}

class CoffeeLiquor extends Ingredient {

    public CoffeeLiquor(int liquid) {
        super("Coffee liquor", liquid, 20);
    }
}

