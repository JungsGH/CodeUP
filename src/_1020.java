import java.util.Scanner;

public class _1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		String[] str1 = str.split("-");
		
		String first = str1[0];
		String second = str1[1];
		
		System.out.println(first + second);
		
		
		
	}
}

/*
 * nextLine() VS next()
 * - nextLine은 문자 or 문장 한라인 전체를 입력 받음
 * - next는 문자 or 문자열을 공백을 기준으로 한 단어 or 한 문자씩 입력 받음
 */

/*
 * str.split("-")
 * : 특정 문자로 문자열을 분리하는 함수
 */

