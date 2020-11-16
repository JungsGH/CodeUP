import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _1018 {
	public static void main(String[] args) {
		// 1. 현재 시간 출력하기
		/*
		Date date_now = new Date(System.currentTimeMillis());
		System.out.println(date_now);
		*/
		
		// 2. 원하는 날짜 & 시간 형태로 출력
		/*
		Date date_now = new Date(System.currentTimeMillis());
		SimpleDateFormat fourteen_format = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(fourteen_format.format(date_now));
		*/
		
		// 3. 외부에서 입력한 문자열을 파싱하고 원하는 날짜&시간 형태로 출력
		SimpleDateFormat input_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat fourteen_format = new SimpleDateFormat("yyyyMMddHHmmss");
		
		try {
			String str_source = "2020-03-01 09:00:00";	// 입력포멧 문자열
			Date data_parsed = input_format.parse(str_source);	// 문자열을 파싱해 Date형으로 저장
			System.out.println(fourteen_format.format(data_parsed));	// 14자리 포멧으로 출력
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}