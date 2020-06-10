package homework4y.Book;

public class Book {
  private String name; // 书名
  private boolean state;
  private String writer; // 作者
  private String publish; // 出版社
  private int number; // 数量

  public Book(String name, boolean state, String writer, String publish, int number) {
    this.name = name;
    this.state = state;
    this.writer = writer;
    this.publish = publish;
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String s) {
    this.name = s;
  }

  public String getWritter() {
    return writer;
  }

  public void setWriter(String s) {
    this.writer = s;
  }

  public String getPublish() {
    return publish;
  }

  public void setPublish(String s) {
    this.publish = s;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int i) {
    this.number = i;
  }

  public boolean getState() {
    return state;
  }

  public void setState(boolean b) {
    this.state = b;
  }
}
