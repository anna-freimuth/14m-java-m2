package HW05modul2;

public class UniApplication {
    public static void main(String[] args) {

        Person liya = new Person("Liya", "Glad", 28);
        Person tom = new Person("Tom", "Tonte", 29);
        Student mira = new Student("Mira", "Lango", 25);
        Student rikki = new Student("Rikki", "Ren", 22);
        Student leo = new Student("Leo", "Lio", 25);
        Worker nikki = new Worker("Nikki", "Reo", 35);
        Worker neo = new Worker("Neo", "Matrix", 32);
        Worker maria = new Worker("Maria", "Lesy", 40);
        Teacher andrea = new Teacher("Andrea", "Kery", 45);
        Teacher alex = new Teacher("Alex", "New", 41);
        Teacher ketty = new Teacher("Ketty", "Kerrs", 46);

        Person[] allPersons = new Person[]{liya, tom, rikki, leo, nikki, neo, maria, andrea, alex, ketty};
        Teacher[] allTeachers = new Teacher[]{andrea, alex, ketty};
        Worker[] allWorkers = new Worker[]{nikki, neo, maria};
        Student[] allStudents = new Student[]{mira, rikki, leo};

        Person.insertionSortAge(allPersons);
        Person.printArr(allPersons);
    }

}
