package com.atatarko;

public class Work2 {
    /* 2) Реализовать метод который вернет строку String,
              в которой через пробел все числа от 1 до 99 со следующими изменениями:
              (!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
              - если число кратно 3 то вывести вместо него Hello
              - если число кратно 5 то вывести вместо него World
              - если число кратно и 3 и 5 то вывести вместо него HelloWorld  */
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
