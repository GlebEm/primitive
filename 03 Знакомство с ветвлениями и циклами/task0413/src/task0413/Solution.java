package task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
���� ������
������ � ���������� ����� ��� ������, � ����������� �� ������ ������� ��������
"�����������", "�������", "�����", "�������", "�������", "�������", "�����������",
���� ������ ����� ������ 7 ��� ������ 1 - ������� "������ ��� ������ �� ����������".

������ ��� ������ 5:
�������

������ ��� ������ 10:
������ ��� ������ �� ����������


Requirements:
1. ��������� ������ ��������� ����� c ����������.
2. ��������� ������ �������� ����� �� �����.
3. ���� ������� ����� �� 1 �� 7, ���������� ������� ���� ������.
4. ���� ������� ����� �� �������� � �������� �� 1 �� 7, �� ������� ����������� ��� ������ ��� ������ �� ����������.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());//�������� ��� ��� ���
switch (day){
    case 1:
        System.out.println("�����������");
        break;
    case 2:
        System.out.println("�������");
        break;
    case 3:
        System.out.println("�����");
        break;
    case 4:
        System.out.println("�������");
        break;
    case 5:
        System.out.println("�������");
        break;
    case 6:
        System.out.println("�������");
        break;
    case 7:
        System.out.println("�����������");
        break;
    default:
        System.out.println("������ ��� ������ �� ����������!");
}
    }
}