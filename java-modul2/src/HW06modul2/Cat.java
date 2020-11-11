package HW06modul2;

public class Cat  extends Pet {
    private int scratchForceInNewtonMeters;

    @Override
    String move() {
        return "prancing with feline grace";
    }

    @Override
    String eat() {
        return "gobbling";
    }

    @Override
    String drink() {
        return "small sip";
    }

    @Override
    String sound() {
        return "meowing";
    }
}


