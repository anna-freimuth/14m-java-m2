package HW06modul2;

public class Swan extends Pet {
    Boolean uglyDuckInDisguise;

    @Override
    String move() {
        return "flying";
    }

    @Override
    String eat() {
        return "gulping fish";
    }

    @Override
    String drink() {
        return "quickly";
    }

    @Override
    String sound() {
        return "kryakrya";
    }
}


