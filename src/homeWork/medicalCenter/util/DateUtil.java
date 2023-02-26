package homeWork.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd/MM/yyyy");
    private static final SimpleDateFormat sdtf = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateToString(Date date) {
        return sdf.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        return sdf.parse(dateStr);
    }
    public static boolean isSameDay(Date date1, Date date2){
       return sdtf.format(date1).equals(sdtf.format(date2));
    }

}
