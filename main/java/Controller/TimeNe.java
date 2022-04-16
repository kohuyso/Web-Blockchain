package Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeNe {
	public static String getTime () {
	    LocalDateTime current = LocalDateTime.now();
	    //sử dụng class DateTimeFormatter để định dạng ngày giờ theo kiểu pattern
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
	    //sử dụng phương thức format() để định dạng ngày giờ hiện tại rồi gán cho chuỗi formatted
	    String formatted = current.format(formatter);
	    return formatted;
	}
}
