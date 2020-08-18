package homework4.Book;

import java.util.ArrayList;
import javax.naming.Name;

public class Book {
  private String name; // 书名
  ArrayList<String> author = new ArrayList<>(); // 多个作者
  private String press; // 出版社
  private int number; // 数量

  public Book(String name, ArrayList<String> author, String press, int number) {
    this.name = name;
    for (String s : author) {
      this.author.add(s);
    }
    this.press = press;
    this.number = number;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<String> getAuthor() {
    return this.author;
  }

  public String getPress() {
    return this.press;
  }

  public int getNumber() {
    return this.number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPress(String press) {
    this.press = press;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String toString() {
    // 重写toString()方法
    return "[" + "书名:" + name + " 作者:" + author + " 出版社:" + press + " 数量:" + number + "]";
  }
}
