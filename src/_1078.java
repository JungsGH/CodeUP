import java.util.Scanner;

public class _1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		sc.close();
		
		for(int i = 0; i <= N; i++) {
			if(i % 2 == 0) {
				result += i;
			}
		}
		
		System.out.println(result);
	}

}
