package homework6x;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.Vector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String str = "中国你好吗＞国你好吗＞中国国家国国国国aabb;;;";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = str.toCharArray();// 将字符串转为数组
        /* 将字符和出现的个数存入到Map */
        for (char c : ch) {
            if (map.get(c) == null) {
                map.put(c, 1);// 为空的话值为1
            } else {
                Integer in = map.get(c);// 得到的value值至少为1
                in++;
                map.put(c, in);
            }
        }

        /*
         * 使用for-each遍历               for (Character c : map.keySet()) {               
         *                       System.out.println(map.get(c));                        
         *      }
         */

        // 使用迭代器和entrySet遍历
        Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();

        Integer count = Collections.max(map.values());// 出现次数最多的值
        Character character = null;// 存放次数最多的key
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>) iterator.next();

            System.out.println(entry.getKey() + "    " + entry.getValue());

            // 得到出现次数最多的值的key
            if (entry.getValue().equals(count)) {
                character = entry.getKey();
            }

        }

        System.out.println("出现次数最多的是：" + character + "出现次数为" + count);

    }
}