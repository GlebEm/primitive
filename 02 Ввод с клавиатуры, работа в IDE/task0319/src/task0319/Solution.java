package task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
������������ �� �������
������ � ���������� �������� ���, �����1, �����2.
������� �������:
"���" �������� "�����1" ����� "�����2" ���.

������:
���� �������� 3000 ����� 5 ���.


Requirements:
1. ��������� ������ �������� �����.
2. ��������� ������ ��������� ������ � ����������.
3. ���������� ����� ������ ��������� ��������� ���.
4. ���������� ����� ������ ��������� ��������� �����1.
5. ���������� ����� ������ ��������� ��������� �����2.
6. ���������� ����� ������ ��������� ��������������� �������.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int money = Integer.parseInt(reader.readLine());
        int years = Integer.parseInt(reader.readLine());//�������� ��� ��� ���
        System.out.println(name + " �������� " + money + " ����� " + years + " ���.");

    }
}
