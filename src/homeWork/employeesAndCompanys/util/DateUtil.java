package homeWork.employeesAndCompanys.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd.MM.yyyy");

    public static String dateToString(Date date){
        if(date==null){
            return null;
        }
        return SDF.format(date);
    }

    public static Date stringToDate(String dateStr) throws ParseException {
         return SDF.parse(dateStr);
    }
}
