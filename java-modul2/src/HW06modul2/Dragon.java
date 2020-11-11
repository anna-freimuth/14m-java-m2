package HW06modul2;

public class Dragon extends Pet {
    String flameColor;

    public Dragon() {
        setColor("black");
    }

    @Override
    String move() {
        return "flying high";
    }

    @Override
    String eat() {
        return "eating villagers";
    }

    @Override
    String drink() {
        return "drinking melted ice";
    }

    @Override
    String sound() {
        return "roaring";
    }
}
