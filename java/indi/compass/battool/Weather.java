package indi.compass.battool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Weather {
    public static String getTemperature() {
        String[] digit = new String[0];
        try {
            URL url = new URL("https://api.seniverse.com/v3/weather/now.json?key=SlBAYvVUQz_sSil2h&location="+"ganzhou"+"&language=zh-Hans&unit=c");
            InputStreamReader isReader = new InputStreamReader(url.openStream(), "UTF-8");
            BufferedReader br = new BufferedReader(isReader);
            String str;
            while ((str = br.readLine()) != null) {
                String regex = "\\p{Punct}+";
                digit = str.split(regex);
            }
            br.close();
            isReader.close();
        } catch (Exception exp) {
            System.out.println(exp);
        }
        return digit[27];
    }
    public static String getPublicIp() {
        try {
            String path = "http://www.net.cn/static/customercare/yourip.asp";// 要获得html页面内容的地址(万网)

            URL url = new URL(path);// 创建url对象

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();// 打开连接

            conn.setRequestProperty("contentType", "GBK"); // 设置url中文参数编码

            conn.setConnectTimeout(5 * 1000);// 请求的时间

            conn.setRequestMethod("GET");// 请求方式

            InputStream inStream = conn.getInputStream();
            // readLesoSysXML(inStream);

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    inStream, "UTF-8"));
            StringBuilder buffer = new StringBuilder();
            String line;
            // 读取获取到内容的最后一行,写入
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            List<String> ips = new ArrayList<>();

            //用正则表达式提取String字符串中的IP地址
            String regEx = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
            String str = buffer.toString();
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(str);
            while (m.find()) {
                String result = m.group();
                ips.add(result);
            }

            // 返回公网IP值
            return ips.get(0);

        } catch (Exception e) {
            System.out.println("获取公网IP连接超时");
            return "";
        }
    }
    public static String getAddress() {
        String[] digit = new String[0];
        try {
            URL url = new URL("https://api.seniverse.com/v3/location/search.json?key=SlBAYvVUQz_sSil2h&q="+getPublicIp());
            InputStreamReader isReader = new InputStreamReader(url.openStream(), "UTF-8");
            BufferedReader br = new BufferedReader(isReader);
            String str;
            while ((str = br.readLine()) != null) {
                String regex = "\\p{Punct}+";
                digit = str.split(regex);
            }
            br.close();
            isReader.close();
        } catch (Exception exp) {
            System.out.println(exp);
        }
        return digit[5];
    }
}
