package com.atatarko;

public class Main {

    public static final double PROC = 1.5;

    public static void main(String[] args) {
	 /* 1) В банк положили s денег. Какой станет сумма вклада через n лет,
          если процент 1,5% добавляется к сумме вклада ежемесячно.
          Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету. */

        investment(5000, 5);
    }
    private static void investment(double s, int n) {
        System.out.println("Изначальный вклад " + s + " гривен");
        for (int i = 0; i < n * 12; i++) {
            s += percent(s);
        }
        System.out.println("За " + n + " лет");
        System.out.printf("Сумма вклада равна %.2f", s);
    }
    private static double percent(double s) {
        double percent = Math.round(s * PROC) / 100.0;
        return percent;
    }
}
