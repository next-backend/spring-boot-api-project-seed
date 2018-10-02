package com.company.project.utils;

import org.joda.time.DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    /**
     *
     * @param endTime
     * @return
     */
    public static String formatYyyyMMdd(Date endTime) {
        SimpleDateFormat sdf = getSdf("yyyyMMdd");
        return sdf.format(endTime);
    }

    /**
     * @param endTime
     * @return true = 过期 ，false = 未过期
     */
    public static boolean checkeCurrentDateExpired(Date endTime) {
        Date currentDate = new Date();
        Date expiredDate = getEarliestDayOfMonth(endTime);
        return currentDate.after(expiredDate);
    }

    /**
     *
     * @param date
     * @return
     */
    public static Date getEarliestDayOfMonth(Date date) {
        String dateStr = format(date, "yyyy-MM-dd") + " 00:00:00";
        DateTime nowTime = null;
        try {
            nowTime = new DateTime(parse(dateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return nowTime.minusDays(nowTime.getDayOfMonth() - 1).plusMonths(1).minusDays(1).toDate();
    }

    public static Date parse(String dateStr) throws ParseException {
        return getSdf("yyyy-MM-dd HH:mm:ss").parse(dateStr);
    }

    public static String format(Date date, String patter) {
        return getSdf(patter).format(date);
    }

    private static SimpleDateFormat getSdf(String patter) {
        return new SimpleDateFormat(patter);
    }
}
