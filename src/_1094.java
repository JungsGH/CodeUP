import java.util.Scanner;

/*[�̻��� �⼮ ��ȣ �θ���2]
 * - �⼮ ��ȣ�� n�� �������� �ҷ��� ��, �θ� ��ȣ�� �Ųٷ� ���
 * 
 */
public class _1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		sc.close();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 23 + 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ");
		
		for(int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
