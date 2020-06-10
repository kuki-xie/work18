package homework4.Operation;

import homework4.Book.BookData;
import java.util.Scanner;

public class searchBook implements Operation {

  @Override
  public void opear(BookData bd) {
    System.out.println("请输入选择 1. 2. 3. 0.");
    Scanner sc = new Scanner(System.in);
    while (true) {
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.println("执行1.");
          String name1 = sc.next();
          boolean flag = false;
          for (Integer key : bd.getBookList().keySet()) {
            if (bd.getBookList().get(key).getName().contains(name1)) {
              System.out.println(
                  "1"
                      + bd.getBookList().get(key).getName()
                      + "1"
                      + bd.getBookList().get(key).getWritter()
                      + "1"
                      + bd.getBookList().get(key).getPublish()
                      + "1"
                      + bd.getBookList().get(key).getNumber());
              flag = true;
            }
          }
          if (!flag) System.out.println("没有这书");

        case 2:
          System.out.println("2");
          String writer1 = sc.next();
          flag = false;
          for (Integer key : bd.getBookList().keySet()) {
            if (bd.getBookList().get(key).getWritter().equalsIgnoreCase(writer1)) {
              // 不考虑大小写
              flag = true;
            }
          }
          if (!flag) System.out.println("未找到");
        case 3:
          System.out.println("3");
          String publish = sc.next();
          flag = false;
          for (Integer key : bd.getBookList().keySet()) {
            if (bd.getBookList().get(key).getPublish().equalsIgnoreCase(publish)) {
              System.out.println(
                  "3"
                      + bd.getBookList().get(key).getName()
                      + "3"
                      + bd.getBookList().get(key).getWritter()
                      + "3"
                      + publish
                      + "3"
                      + bd.getBookList().get(key).getNumber());
              flag = true;
            }
          }
          if (!flag) System.out.println("3");
        case 0:
          break;
      }
    }
  }
}
