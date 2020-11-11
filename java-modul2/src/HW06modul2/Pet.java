package HW06modul2;

abstract class Pet {
    private String order;
    private String family;
    private String color;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String move() {

        return "moving";
    }

    String eat() {
        return "eating";
    }

    String drink() {
        return "drinking";
    }

    String sound() {
        return "Making noise";
    }
}
