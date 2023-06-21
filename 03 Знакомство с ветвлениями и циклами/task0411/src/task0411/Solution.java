package task0411;

/* 
����� ����
������ ����� checkSeason. �� ������ ������, ����� ������ ���������� ����� ���� (����, �����, ����, �����) � ������� �� �����.

������ ��� ������ ������ 2:
����

������ ��� ������ ������ 5:
�����


Requirements:
1. ��������� ������ �������� ����� �� �����.
2. ����� main �� ������ �������� ������� System.out.println ��� System.out.print.
3. ����� main ������ �������� ����� checkSeason.
4. ����� checkSeason ������ ���� static void, � ����� ������ ���� �������� int.
5. ����� checkSeason ������ �������� ����� �� ����� �������� �������.*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        switch (month){
            case 12,1,2:
                System.out.println("����");
                break;
            case 3,4,5:
                System.out.println("�����");
                break;
            case 6,7,8:
                System.out.println("����");
                break;
            case 9,10,11:
                System.out.println("�����");
                break;

        }
    }
}