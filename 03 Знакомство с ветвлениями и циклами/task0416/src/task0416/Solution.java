package task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
��������� ������ �������
������ ��������� ��� ��������� ����������������� ��������� �������:
� ������ ������� ���� � ������� ���� ����� ����� ������ ������,
����� � ������� ����� ������ - �����,
� ����� � ������� ����� ������ - �������,
����� ����� ������ ����� ��� ������ � �. �.
������ � ���������� ������������ ����� t, ���������� ����� � �������, ��������� � ������ ���������� ����.
����������, ������ ������ ����� ����� ��� ��������� � ���� ������.
��������� ������� �� ����� � ��������� ����:
"������" - ���� ����� ������ ����,
"�����" - ���� ����� ����� ����,
"�������" - ���� ����� ������� ����.

������ ��� ����� 2.5:
������

������ ��� ����� 3:
�����

������ ��� ����� 4:
�������

������ ��� ����� 5:
������


Requirements:
1. ��������� ������ ��������� ������������ ����� c ����������.
2. ��������� ������ �������� ����� �� �����.
3. ���� ����� ������ ����, ���������� ������� �����: "������"
4. ���� ����� ����� ����, ���������� ������� �����: "�����"
5. ���� ����� ������� ����, ���������� ������� �����: "�������"
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());//�������� ��� ��� ���
        if (t <= 60 && t >= 0) {
            if (t % 5 >= 0 && t % 5 <= 3.0) {
                System.out.println("������");
            }else if(t%5>=0 && t%5 <=4.0){
                System.out.println("�����");
            }else if(t%5>=0 && t%5 <=5.0){
                System.out.println("�������");
            }
        }
        else System.out.println("������� �� ���������� �����");
    }
}