import java.util.Scanner;

/* [�̻��� �⼮ ��ȣ �θ���1]
 * input : �⼮ ��ȣ�� �θ� Ƚ�� n -> �������� �θ� n���� ��ȣ �Է�
 * output : 1 ~ 23���� ��ȣ�� �Ҹ� Ƚ���� ���
 */
public class _1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[24];
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 23 + 1);
			arr[num] += 1;
		}
		
		for(int count : arr) {
			System.out.println(count);
			
		}
		
	}

/* Math.random() -> double��
 * - 0.0 <= Math.random() < 1.0
 * - 1 ~ 23���� ǥ�� => Math.random() * 23 + 1
 * 
 */
}
