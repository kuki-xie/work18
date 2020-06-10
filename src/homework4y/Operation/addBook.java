package homework4y.Operation;

import homework4y.Book.Book;
import homework4y.Book.BookData;
import java.util.Scanner;

public class addBook implements Operation {

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
    int number = in.nextInt();
    Book book = new Book(name, false, writer, publish, number);
    boolean flag = false;
    for (Integer key : bd.getBookList().keySet()) {
      if (bd.getBookList().get(key).getName().equalsIgnoreCase(name)
          && bd.getBookList().get(key).getWritter().equalsIgnoreCase(writer)
          && bd.getBookList().get(key).getPublish().equalsIgnoreCase(publish)) {
        System.out.println("3");
        flag = true;
        break;
      }
    }
    if (!flag) {
      bd.getBookList().put(bd.getBookList().size() + 1, book);
      System.out.println("" + name + "1");
      System.out.println("=================");
    }
  }
}
