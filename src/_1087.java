import java.util.Scanner;

public class _1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		sc.close();
		
		for(int i = 1; result < N; i++) {
			result += i;
		}
		
		System.out.println(result);

	}

}
