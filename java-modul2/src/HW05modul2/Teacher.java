package HW05modul2;

public class Teacher extends UniUser {
    private String subject;
    private String position;
    private String range;
    private String degree;
    private int teachingExperienceYears;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getTeachingExperienceYears() {
        return teachingExperienceYears;
    }

    public void setTeachingExperienceYears(int teachingExperienceYears) {
        this.teachingExperienceYears = teachingExperienceYears;
    }

    public Teacher(String firstName) {
        super(firstName);
    }

    public Teacher(String firstName, String secondName, String uniID, int age, String range) {
        super(firstName, secondName, uniID, age);
        this.range = range;
    }

    public void getSalary(double salary) {
        System.out.println("Getting per month " + salary + "€");
    }

    public void teach() {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }

    public Teacher(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Teacher{" + super.firstName + " " + this.range + "}" + this.firstName;
    }
}
