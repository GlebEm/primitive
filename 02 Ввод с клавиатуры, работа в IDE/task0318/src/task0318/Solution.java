package task0318;

/* 
���� �� ������� ����
������ � ���������� ����� � ���, ������� �� ����� ������:
"���" �������� ��� ����� "�����" ���. ��-��-��!

������:
���� �������� ��� ����� 8 ���. ��-��-��!

������������������ �������� ������ ����� ������� ��������.


Requirements:
1. ��������� ������ �������� �����.
2. ��������� ������ ��������� ������ � ����������.
3. ���������� ����� ������ ��������� ��������� ���.
4. ���������� ����� ������ ��������� ��������� �����.
5. ���������� ����� ������ ��������� ��������������� �������.
6. �������� ������ � ���������� ����� �����  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
7. ������ ������ �� BufferedReader ����� ����� String a = reader.readLine();
8. ����� ������ ���� int !!!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());// �������� ��� ��� �����
        String a = reader.readLine();
        System.out.println(a+" �������� ��� ����� "+b+" ���. ��-��-��!");
    }
}
