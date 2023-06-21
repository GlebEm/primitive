package task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double max = 0;
        for (int i = 0; i < 4; i++) {
            double n = Double.parseDouble(reader.readLine());
            if (max < n) {
                max = n;
            }
        }
        System.out.println(max);
    }
}
