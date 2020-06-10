package homework4.Operation;

import homework4.Book.BookData;
import java.util.Scanner;

public class deleteBook implements Operation {

  @Override
  public void opear(BookData bd) {
    Scanner in = new Scanner(System.in);
    System.out.println("输入书名");
    String name = in.next();
    System.out.println("输入作者");
    String writer = in.next();
    System.out.println("输入出版社");
    String publish = in.next();
    System.out.println("输入数量");
    boolean flag = false;
    for (Integer key : bd.getBookList().keySet()) {
      if (bd.getBookList().get(key).getName().equalsIgnoreCase(name)
          && bd.getBookList().get(key).getWritter().equalsIgnoreCase(writer)
          && bd.getBookList().get(key).getPublish().equalsIgnoreCase(publish)
          && bd.getBookList().get(key) != null
          && !bd.getBookList().get(key).getState()) {
        flag = true;
        bd.getBookList().remove(key);
        System.out.println("删去" + name + "2");
        break;
      } else if (bd.getBookList().get(key).getName().equalsIgnoreCase(name)
          && bd.getBookList().get(key).getWritter().equalsIgnoreCase(writer)
          && bd.getBookList().get(key).getPublish().equalsIgnoreCase(publish)
          && bd.getBookList().get(key) != null
          && bd.getBookList().get(key).getState()) {
        flag = true;
        System.out.println("1" + name + "1");
        break;
      }
    }
    if (!flag) {
      System.out.println("222");
      System.out.println("===========");
    }
  }
}
