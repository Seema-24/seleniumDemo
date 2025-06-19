package basicTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ADateChecker {

	public static void main(String[] args) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String time = new SimpleDateFormat("YYYY.MM.dd.hh.mm.ss").format(new Date());
		System.out.println(timestamp);
		System.out.println(time);
	}

}
