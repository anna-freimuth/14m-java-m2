package HW05modul2;

public class UniUser extends Person {
    String firstName;
    private String secondName;
    String uniID;
    private int age;

    public UniUser(String firstName) {
        this.firstName = firstName;
    }

    public UniUser(String uniID, int age) {
        this.uniID = uniID;
        this.age = age;
    }

    public UniUser(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public UniUser(String firstName, String secondName, String uniID, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", uniID='" + uniID + '\'' +
                ", age=" + age +
                '}';
    }
}
