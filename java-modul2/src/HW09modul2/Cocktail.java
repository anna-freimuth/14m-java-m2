package HW09modul2;

import java.util.Arrays;

public class Cocktail {
    private String name;
    private Ingredient[] ingredients;


    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public double getPercentageAlcohol() {
        int totalLiquid = getLiquid();
        if (totalLiquid == 0) return 0;
        return totalVolumeOfAlcohol() * 100 / totalLiquid;
    }

    public double totalVolumeOfAlcohol() {
        double totalVolume = 0.0;
        for (Ingredient ingredient : ingredients) {
            totalVolume += ingredient.amountOfAlcohol();
        }
        return totalVolume;
    }

    public int getLiquid() {
        int totalVolume = 0;
        for (Ingredient ingredient : ingredients) {
            totalVolume += ingredient.getLiquid();
        }
        return totalVolume;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", liquid=" + getLiquid() + ", " +
                "ingredient=" + Arrays.toString(ingredients) +
                "\npercentageAlcoholCocktail=" + getPercentageAlcohol() +
                '}';
    }
}


