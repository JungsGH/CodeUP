import java.util.Scanner;

/* [���ϴ� ���ڰ� �Էµ� ������ �ݺ� ����ϱ�]
 * - input : ���ڵ��� 1���� ��� �Է�
 * - output : "q"�� �Էµ� ������ �Էµ� ���ڸ� ���� �ٲ� �� �پ� ���
 * 
 */
public class _1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			String n = sc.next();
			if(n.equals("q")) {
				System.out.println(n);
				sc.close();
				break;
			} 
			
			else {
				System.out.println(n);
			}
		}
	}

	/* String.equals();
	 * - true : ��ȣ���� ���ڿ� ������ ��
	 * - false :��ȣ���� ���ڿ� �������� ���� ��
	 */
}

