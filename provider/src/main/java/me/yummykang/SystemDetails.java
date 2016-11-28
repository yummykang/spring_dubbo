package me.yummykang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * desc the file.
 *
 * @author demon
 * @Date 2016/11/28 15:29
 */
public class SystemDetails {
    public static void printDetails() {
        timeZone();
        currentTime();
        osInfo();
    }

    public static void timeZone() {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();
        System.out.println("系统时区：" + timeZone.getDisplayName());
    }

    public static void currentTime() {
        String fromFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(fromFormat);
        Date myDate = new Date();
        System.out.println("系统时间:" + format.format(myDate));
    }

    public static void osInfo() {
        String osName = System.getProperty("os.name"); //操作系统名称
        System.out.println("当前系统:" + osName);
        String osArch = System.getProperty("os.arch"); //操作系统构架
        System.out.println("当前系统架构" + osArch);
        String osVersion = System.getProperty("os.version"); //操作系统版本
        System.out.println("当前系统版本:" + osVersion);
    }
}
