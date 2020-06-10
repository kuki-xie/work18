package homework4.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {
  Map<Integer, Book> bookMap = new HashMap<Integer, Book>();

  public Data() {
    ArrayList<String> author1 = new ArrayList<String>();
    author1.add("郎波");
    Book book1 = new Book("Java语言程序设计", author1, "清华大学出版社", 10);

    ArrayList<String> author2 = new ArrayList<String>();
    author2.add("同济大学数学系");
    Book book2 = new Book("高等数学", author2, "同济大学出版社", 20);

    ArrayList<String> author3 = new ArrayList<String>();
    author3.add("武波");
    author3.add("黄健斌");
    author3.add("尹忠海");
    author3.add("毛立强");
    Book book3 = new Book("离散数学", author3, "西安电子科技大学出版社", 10);

    bookMap.put(1, book1);
    bookMap.put(2, book2);
    bookMap.put(3, book3);
  }

  public HashMap<Integer, Book> getbookMap() {
    return (HashMap<Integer, Book>) bookMap;
  }
}
