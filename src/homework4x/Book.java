package homework4x;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
  private final String name;
  private final ArrayList<String> author = new ArrayList<String>();
  private final String press;
  private int totalNum;
  private int id;

  Book(String name, ArrayList<String> author, String press, int totalNum) {
    this.name = name;
    for (String s : author) {
      this.author.add(s);
    }
    this.press = press;
    this.totalNum = totalNum;
  }

  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((author == null) ? 0 : author.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((press == null) ? 0 : press.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return totalNum == book.totalNum
        && id == book.id
        && Objects.equals(name, book.name)
        && Objects.equals(author, book.author)
        && Objects.equals(press, book.press);
  }

  String getName() {
    return this.name;
  }

  ArrayList<String> getAuthor() {
    return this.author;
  }

  String getPress() {
    return this.press;
  }

  int getTotalNum() {
    return this.totalNum;
  }

  void setName(int num) {
    this.totalNum = num;
  }

  int getId() {
    return this.id;
  }

  void setId(int id) {
    this.id = id;
  }

  void println() {
    System.out.print(this.name + "\t");
    System.out.print(this.press + "\t");
    System.out.print(this.author);
  }
}
