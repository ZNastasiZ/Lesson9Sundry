# Introduction Java 
**Homework 9** consists of two tasks:

*1) В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5% добавляется к сумме вклада ежемесячно. Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.;

*2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99 со следующими изменениями: (!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
              - если число кратно 3 то вывести вместо него Hello
              - если число кратно 5 то вывести вместо него World
              - если число кратно и 3 и 5 то вывести вместо него HelloWorld  */
## Task 1:
```java
public class Main {

    public static final double PROC = 1.5;

    public static void main(String[] args) {
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
}
```
## Task 2:
```java
public class Work2 {
    public static void main(String[] args) {
        System.out.println(returning());
    }
    public static String returning() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 99; i++)
            if ((i % 5 == 0) && (i % 3 == 0)) {
                sb.append(" HelloWorld ");
            } else if (i % 3 == 0) {
                sb.append(" Hello ");
            } else if (i % 5 == 0) {
                sb.append(" World ");
            } else {
                sb.append("(").append(i).append(") ");
            }
        return sb.toString();
    }
}
```