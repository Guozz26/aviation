package aviation.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	日期的工具类
 * 
 */
public class DateUtil {
	
	// - 根据某种格式把字符传转化为日期；
	// - dateFormat	给一个日期的格式
	// - dateStr 日期
	// - return 日期
	public static Date toDate(String dateFormat , String dateStr) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	// -根据某种日期格式，把日期转化为字符串
	public static String dateToString(String dateFormat,Date date) {
	
		return new SimpleDateFormat(dateFormat).format(date);
		
	}
}
