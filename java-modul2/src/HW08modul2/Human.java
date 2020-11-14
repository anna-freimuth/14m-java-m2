package HW08modul2;

import java.time.LocalDate;
import java.time.Period;

class Human {

    LocalDate birthday;

    public Human(int year, int month, int day) {

        birthday = LocalDate.of(year, month, day);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getYears() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(getBirthday(), today);
        return period.getYears();
    }
}

class HumanYearsTest {

    public static void main(String[] args) {
        Human maria = new Human(1990, 10, 1);
        Human mark = new Human(1986, 7, 29);
        System.out.println("Full amount of years: " + maria.getYears());
        System.out.println("Full amount of years: " + mark.getYears());
    }
}

