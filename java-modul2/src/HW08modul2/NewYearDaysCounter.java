package HW08modul2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NewYearDaysCounter {
    public static void main(String[] args) {
        System.out.println(newYearDaysCount());
    }

    public static LocalDate getDateInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date, from which you want to count days until next Mew Year (yyyy-MM-dd)");
        String date = input.next();
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static int newYearDaysCount() {
        LocalDate newYear = LocalDate.of(2021, 1, 1);
        Period period = Period.between(getDateInput(), newYear);
        return period.getDays();
    }
}

