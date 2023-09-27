package io.github.bitbox.bitbox.util;

import io.github.bitbox.bitbox.enums.SubscriptionStatus;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTimeUtil {
    public static Date convertToSqlDate(String date) {
        SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyyMMdd");
        java.util.Date utilDate;

        try {
            utilDate = inputFormatter.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(utilDate);

        utilDate = calendar.getTime();

        return new Date(utilDate.getTime());
    }

    public static LocalDateTime convertTimeFormat(String inputString) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return LocalDateTime.parse(inputString, inputFormatter)
                .withMinute(0)
                .withSecond(0);
    }

    public static SubscriptionStatus compareTwoTime(LocalDateTime currentTime, LocalDateTime userExpirationTime) {
        // 만료
        if (currentTime.compareTo(userExpirationTime) >= 0) {
            return SubscriptionStatus.EXPIRED;
        }

        // 1시간전(알림)
        if (currentTime.plusHours(1).equals(userExpirationTime)) {
            return SubscriptionStatus.ONE_HOUR_LEFT;
        }

        // 그외
        return SubscriptionStatus.OTHER;
    }
}