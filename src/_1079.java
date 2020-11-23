import java.util.Scanner;

/* [원하는 문자가 입력될 때까지 반복 출력하기]
 * - input : 문자들이 1개씩 계속 입력
 * - output : "q"가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력
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
	 * - true : 괄호안의 문자와 동일할 때
	 * - false :괄호안의 문자와 동일하지 않을 때
	 */
}

