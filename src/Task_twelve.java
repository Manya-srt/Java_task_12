// Необходимо провести сравнение длинны двух строк,
// которые были введены с клавиатуры и записаны в соответствующие переменные.
// Вывести на экран строку с наибольшей длинной.

import java.util.Scanner;

public class Task_twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое сообщение");
        String sms = scanner.nextLine();
        int len = sms.length();

        System.out.println("Введите второе сообщение");
        String sms2 = scanner.nextLine();
        int len2 = sms2.length();

        // Сравнение длин строк sms и sms2.
        if (len > len2) {
            System.out.println("Результат " + sms);
        }
        if (len < len2) {
            System.out.println("Результат " + sms2);
        }
        else {
            System.out.println("Строки " + sms + " и " + sms2 + " равны.");
        }
    }
}