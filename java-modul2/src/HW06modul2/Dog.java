package HW06modul2;

public class Dog extends Pet {
  int amountHuntedCats;

  @Override
  String move() {
    return "happily running";
  }

  @Override
  String eat() {
    return "eating with a wagging tail";
  }

  @Override
  String drink() {
    return "drinking with a wagging tail";
  }

  @Override
  String sound() {
    return "bark";
  }
}
