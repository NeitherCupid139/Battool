package indi.compass.battool;

public class Data {
    private static String month,day,location,temprature;

    public static String getMonth() {
        return month;
    }

    public static void setMonth(String month) {
        Data.month = month;
    }

    public static String getDay() {
        return day;
    }

    public static void setDay(String day) {
        Data.day = day;
    }

    public static String getLocation() {
        return location;
    }

    public static void setLocation(String location) {
        Data.location = location;
    }

    public static String getTemprature() {
        return temprature;
    }

    public static void setTemprature(String temprature) {
        Data.temprature = temprature;
    }
}
