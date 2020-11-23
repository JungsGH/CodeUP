import java.util.Scanner;

/* [�ٵ��ǿ� �� �� ����]
 * - ù �� : �ٵ��ǿ� �÷� ���� �� ���� ���� �Է�
 * - ��° �� : n+1 ��° �ٱ��� �� ���� ���� ��ǥ (x,y)�� n�� �Է�
 * -> n <= 10  (x, y) : 1 ~ 19
 * - ��� : �� ���� �÷��� �ٵ��� ��Ȳ ��� (�� �� : 1, ���� �� : 0)
 */
public class _1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// �� ���� ����
		int[][] arr = new int[20][20];
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x-1][y-1] = 1;
		}
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] != 1) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(j / 19 == 1) {
					System.out.println("");
				} else {
					System.out.print(arr[i][j]);
				}
			}
		}
			
	}

}
