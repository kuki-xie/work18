package PPT4;

import java.util.Map;
import java.util.TreeMap;

public class Freq {
  public static void main(String[] args) {
    String[] words = {"if", "it", "to", "be", "it", "is", "up", "to", "me", "to", "delegate"};
    Integer freq;
    Map<String, Integer> m = new TreeMap<String, Integer>();
    for (String a : words) { // 以（单词，词频）为键值对，构造频率表
      freq = m.get(a); // 获取指定单词的词频
      if (freq == null) { // 词频递增
        freq = new Integer(1);
      } else {
        freq = new Integer(freq.intValue() + 1); // intValue()
      }
      m.put(a, freq); // 在Map中更改词频
    }
    System.out.println(m.size() + " distinct words detected:");
    System.out.println(m);
  }
}
