import java.util.Scanner;

// 16���� ������
public class _1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		int K = Integer.parseInt(N, 16);
		
		for(int i = 1; i < 10; i++) {
			System.out.println(N + "*" + i + "=" + Integer.toString(K*i, 16).toUpperCase());
		}
		
	}

	/* - ������ -> ������
	 * : Integer.parseInt()
	 * - ������ -> ������
	 * : Integer.toString()
	 * 
	 * - �빮�� -> �ҹ���
	 * : toLowerCase()
	 * - �ҹ��� -> �빮��
	 * : toUpperCase()
	 */
}
