package task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
����� ��� �����?
������ � ���������� ��� �����, � ���� ����� ���������� ������� ��������� "����� ���������".
���� ����� ������, �� �� ����� ����� - ������� ��������� - "����� ���� �����".
���� ����� � ����� ���� ������ - ������ �� ��������.


Requirements:
1. ��������� ������ ��������� ��� ������ c ����������.
2. ��������� ������ ��������� System.out.println() ��� System.out.print()
3. ���� ����� ���������� ������� ��������� "����� ���������"
4. ���� ����� ������, �� �� ����� ����� , ������� ��������� "����� ���� �����"
5. ���� ����� � ����� ���� ������ - ������ �� ��������.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (name1.equals(name2)) {
            System.out.println("����� ���������");
        } else if (name1.length() == name2.length()) System.out.println("����� ���� �����");
    }
}

