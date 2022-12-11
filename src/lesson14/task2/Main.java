package lesson14.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().plusDays(1);
        while(!date.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
            date = date.plusDays(1);
        }
        System.out.println(date);
    }
}
