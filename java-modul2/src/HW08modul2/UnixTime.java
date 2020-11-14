package HW08modul2;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UnixTime {
    public static void main(String[] args) {
        System.out.println("Unix Time: " + unixTime());
    }

    public static LocalDate getDateInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date (yyyy-MM-dd)");
        String date = input.next();
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static long unixTime() {
        LocalDate date = getDateInput();
        return date.atStartOfDay().toEpochSecond(ZoneOffset.UTC);
    }
}

