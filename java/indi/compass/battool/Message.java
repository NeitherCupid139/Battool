package indi.compass.battool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Message {
    public static String getMessage(int index){
         ArrayList<String> messageList = new ArrayList<String>();
         messageList.add("臣心一片磁针石，不指南方不肯休。");
         messageList.add("况屈指中秋，十分好月，不照人圆。");
         messageList.add("正蹇驴吟影，茶烟灶冷，酒亭门闭。");
         messageList.add("正蹇驴吟影，茶烟灶冷，酒亭门闭。");
         messageList.add("五原春色旧来迟，二月垂杨未挂丝。");
         messageList.add("独坐幽篁里，弹琴复长啸。");
         messageList.add("春未来时，酒携不到千岩路。");
         messageList.add("寻思不似鹊桥人，犹自得、一年一度。");
         messageList.add("孤帆远影碧空尽，唯见长江天际流。");
         return messageList.get(index);
    }
}
