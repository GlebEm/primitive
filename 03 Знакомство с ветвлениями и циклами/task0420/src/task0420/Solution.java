package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());
        double min1 = Math.min(a, (Math.min(b, c)));
        double max1 = Math.max(a, (Math.max(b, c)));
        double avg = 0;
        if (a > min1 && a < max1) {
            avg = a;
        } else if (b > min1 && b < max1) {
            avg = b;
        } else avg = c;
        {
            System.out.println(max1 + " " + avg + " " + min1);
        }
    }
}

/**public class Solution {
 public static void main(String[] args) throws Exception {
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 Double a = Double.parseDouble(reader.readLine());
 Double b = Double.parseDouble(reader.readLine());
 Double c = Double.parseDouble(reader.readLine());
 if (a > b && a > c && b > c) {
 System.out.println(a + " " + b + " " + c);
 } else if (a > b && a > c && c > b) {
 System.out.println(a + " " + c + " " + b);
 } else if (b > a && b > c && a > c) {
 System.out.println(b + " " + a + " " + c);
 } else if (b > a && b > c && c > a) {
 System.out.println(b + " " + c + " " + a);
 } else if (c > a && c > b && b > a) {
 System.out.println(c + " " + b + " " + a);
 } else if (c > a && c > b && a > b) {
 System.out.println(c + " " + a + " " + b);
 }
 }
 }
 */