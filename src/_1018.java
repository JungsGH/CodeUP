import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _1018 {
	public static void main(String[] args) {
		// 1. ���� �ð� ����ϱ�
		/*
		Date date_now = new Date(System.currentTimeMillis());
		System.out.println(date_now);
		*/
		
		// 2. ���ϴ� ��¥ & �ð� ���·� ���
		/*
		Date date_now = new Date(System.currentTimeMillis());
		SimpleDateFormat fourteen_format = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(fourteen_format.format(date_now));
		*/
		
		// 3. �ܺο��� �Է��� ���ڿ��� �Ľ��ϰ� ���ϴ� ��¥&�ð� ���·� ���
		SimpleDateFormat input_format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat fourteen_format = new SimpleDateFormat("yyyyMMddHHmmss");
		
		try {
			String str_source = "2020-03-01 09:00:00";	// �Է����� ���ڿ�
			Date data_parsed = input_format.parse(str_source);	// ���ڿ��� �Ľ��� Date������ ����
			System.out.println(fourteen_format.format(data_parsed));	// 14�ڸ� �������� ���
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}