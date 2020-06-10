package PPT4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
  public static void main(String[] args) {
    String sentence = "I believe I can fly, I believe I can touch the sky.";
    String[] strs = sentence.split(" ");
    List<String> list = new ArrayList<String>(Arrays.asList(strs));
    Iterator<String> it = list.iterator();
    while (it.hasNext()) System.out.println(it.next() + "_");
    System.out.println();

    it = list.iterator();
    while (it.hasNext()) {
      if (it.next().equals("I")) it.remove();
    }
    it = list.iterator();
    while (it.hasNext()) System.out.println(it.next() + " ");
    System.out.println();
  }
}
