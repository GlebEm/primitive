package task0410;

/* 
������-��-������
������ ����� checkInterval. ����� ������ ��������� ������ �� ����� ����� � �������� �� 50 �� 100
� �������� ��������� �� ����� � ��������� ����: "����� number �� ���������� � ���������."
��� "����� number ���������� � ���������.", ��� number - �������� ������.

������ ��� ����� 112:
����� 112 �� ���������� � ���������.

������ ��� ����� 60:
����� 60 ���������� � ���������.


Requirements:
1. ��������� ������ �������� ����� �� �����.
2. ����� main �� ������ �������� System.out.println() ��� System.out.print().
3. ����� main ������ �������� ����� checkInterval.
4. ����� checkInterval ������ ���� static void.
5. ����� checkInterval ������ �������� ����� �� ����� �������� �������.*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        if (number<50 || number>100) {
            System.out.println("����� " + number + " �� ���������� � ���������.");
        }else System.out.println("����� "+number+ " ���������� � ���������.");
            //�������� ��� ��� ���

        }
    }