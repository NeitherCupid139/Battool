package indi.compass.battool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;

public class Calendar {
    public static String getMonth(){
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int month = cal.get(java.util.Calendar.MONTH) + 1;
        String M = "";
        switch (month) {
            case 1: M = "一月";break;
            case 2: M = "二月";break;
            case 3: M = "三月";break;
            case 4: M = "四月";break;
            case 5: M = "五月";break;
            case 6: M = "六月";break;
            case 7: M = "七月";break;
            case 8: M = "八月";break;
            case 9: M = "九月";break;
            case 10: M = "十月";break;
            case 11: M = "十一月";break;
            case 12: M = "十二月";break;
        }
        return M;
    }
    public static String getDay(){
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int day = cal.get(java.util.Calendar.DATE);
        String D = "";
        switch (day){
            case 1: D = "一日";break;
            case 2: D = "二日";break;
            case 3: D = "三日";break;
            case 4: D = "四日";break;
            case 5: D = "五日";break;
            case 6: D = "六日";break;
            case 7: D = "七日";break;
            case 8: D = "八日";break;
            case 9: D = "九日";break;
            case 10: D = "十日";break;
            case 11: D = "十一";break;
            case 12: D = "十二";break;
            case 13: D = "十三";break;
            case 14: D = "十四";break;
            case 15: D = "十五";break;
            case 16: D = "十六";break;
            case 17: D = "十七";break;
            case 18: D = "十八";break;
            case 19: D = "十九";break;
            case 20: D = "二十";break;
            case 21: D = "二十一";break;
            case 22: D = "二十二";break;
            case 23: D = "二十三";break;
            case 24: D = "二十四";break;
            case 25: D = "二十五";break;
            case 26: D = "二十六";break;
            case 27: D = "二十七";break;
            case 28: D = "二十八";break;
            case 29: D = "二十九";break;
            case 30: D = "三十";break;
            case 31: D = "二十一";break;
        }
        return D;
    }
}
