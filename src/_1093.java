import java.util.Scanner;

/* [이상한 출석 번호 부르기1]
 * input : 출석 번호를 부른 횟수 n -> 무작위로 부른 n개의 번호 입력
 * output : 1 ~ 23까지 번호가 불린 횟수를 출력
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

/* Math.random() -> double형
 * - 0.0 <= Math.random() < 1.0
 * - 1 ~ 23까지 표현 => Math.random() * 23 + 1
 * 
 */
}
