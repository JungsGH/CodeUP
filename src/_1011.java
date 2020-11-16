import java.util.Scanner;

// 문자 1개 입력받아 그대로 출력하기
public class _1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String word = sc.nextLine();
		 sc.close();
		 
		 System.out.println(word);
		 
	}

}

/* String 문자열
 * - str1.size() : string의 사이즈를 반환
 * - str1.length() : string의 길이 반환
 * - str1.capacity() : string 객체에 할당된 메모리 크기(bytes) 반환
 */
