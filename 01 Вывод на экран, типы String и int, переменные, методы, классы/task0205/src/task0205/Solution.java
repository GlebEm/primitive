package task0205;

/* 
�������� � ��������
� ������ public static void hackSalary(int salary) ������� �������� �� 100 � ������ �� ����� �������: "���� �������� ����������: <salary+100> �������� � �����."
��� <salary+100> - ��� �������� ����������� �� 100.

���������:
��������� ����������� "����� " + (salary+�����) + " �����".
����� �������� �������� � ������.

������ ������ �� ����� ��� salary = 700:
���� �������� ����������: 800 �������� � �����.


Requirements:
1. ��������� ������ �������� ����� �� �����.
2. ����� main �� ������ �������� System.out.println ��� System.out.print.
3. ����� hackSalary �� ������ ���������� ���������.
4. ����� main ������ ������� ����� hackSalary ������ ���� ���.
5. ����� hackSalary ������ ��������� ���������� ����� �� 100 � ������� �� ����� ������� �������� �������.*/

public class Solution {
    public static void main(String[] args) {
        hackSalary(700);        //��������
    }

    public static void hackSalary(int salary) {
        System.out.println("���� �������� ����������: "+(salary+100)+" �������� � �����.");//
    }
}
