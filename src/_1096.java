import java.util.Scanner;

/* [바둑판에 흰 돌 놓기]
 * - 첫 줄 : 바둑판에 올려 놓을 흰 돌의 개수 입력
 * - 둘째 줄 : n+1 번째 줄까지 흰 돌을 놓을 좌표 (x,y)가 n줄 입력
 * -> n <= 10  (x, y) : 1 ~ 19
 * - 결과 : 흰 돌이 올려진 바둑판 상황 출력 (흰 돌 : 1, 없는 곳 : 0)
 */
public class _1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 흰 돌의 개수
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
