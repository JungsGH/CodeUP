import java.util.Scanner;

// 16진수 구구단
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

	/* - 문자형 -> 숫자형
	 * : Integer.parseInt()
	 * - 숫자형 -> 문자형
	 * : Integer.toString()
	 * 
	 * - 대문자 -> 소문자
	 * : toLowerCase()
	 * - 소문자 -> 대문자
	 * : toUpperCase()
	 */
}
