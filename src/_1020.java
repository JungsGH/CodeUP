import java.util.Scanner;

public class _1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		String[] str1 = str.split("-");
		
		String first = str1[0];
		String second = str1[1];
		
		System.out.println(first + second);
		
		
		
	}
}

/*
 * nextLine() VS next()
 * - nextLine�� ���� or ���� �Ѷ��� ��ü�� �Է� ����
 * - next�� ���� or ���ڿ��� ������ �������� �� �ܾ� or �� ���ھ� �Է� ����
 */

/*
 * str.split("-")
 * : Ư�� ���ڷ� ���ڿ��� �и��ϴ� �Լ�
 */

