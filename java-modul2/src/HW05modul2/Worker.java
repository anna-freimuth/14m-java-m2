package HW05modul2;

public class Worker extends UniUser {

    private String uniID;
    private String position;

    private boolean promotionThisYear;

    public String getUniID() {
        return uniID;
    }

    public void setUniID(String uniID) {
        this.uniID = uniID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isPromotionThisYear() {
        return promotionThisYear;
    }

    public void setPromotionThisYear(boolean promotionThisYear) {
        this.promotionThisYear = promotionThisYear;
    }

    public Worker(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }


    public Worker(String uniID, int age) {
        super(uniID, age);
    }

    public void getSalary(double salary) {
        System.out.println("Getting per month " + salary + "€");
    }
}
