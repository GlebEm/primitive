package task0132;

/* 
Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
3. Метод sumDigitsInNumber должен возвращать значение типа int.
4. Метод sumDigitsInNumber не должен ничего выводить на экран.
5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum2;
        int a3 = number % 10;
        number = number / 10;
        int b3 = number % 10;
        number = number / 10;
        int c3 = number % 10;
        sum2 = a3 + b3 + c3;
/**ИЛИ
    String numbers = Integer.toString(number);
//        char a1 = numbers.charAt(0);
//        int a = Character.digit(a1, 10);
//        char b1 = numbers.charAt(1);
//        int b = Character.digit(b1, 10);
//        char c1 = numbers.charAt(2);
//        int c = Character.digit(c1, 10);
//        int sum = a + b + c;
        return sum;     */
        return sum2;
    }
}