package homework4.Operations;

import homework4.Book.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class deleteBook extends Operation {

  @Override
  public void operation(Data data) {
    Scanner in = new Scanner(System.in);
    System.out.println("----| Operation:addBook |----");
    System.out.println("|----------------------------|");
    System.out.println("|          已有图书           |");
    System.out.println("|----------------------------|");

    for (Integer key : data.getbookMap().keySet()) {
      System.out.println(data.getbookMap().get(key).toString());
    }
    System.out.println("|----------------------------|");
    System.out.println("|          请输入书名          |");
    System.out.println("|----------------------------|");
    String name = in.next();

    System.out.println("|----------------------------|");
    System.out.println("|     请输入作者(空格分开)      |");
    System.out.println("|----------------------------|");
    String str = in.next();
    String[] array = str.split(" ");
    ArrayList<String> author = new ArrayList<String>();
    for (String element : array) {
      author.add(element);
    }

    System.out.println("|----------------------------|");
    System.out.println("|          请输入出版社        |");
    System.out.println("|----------------------------|");
    String press = in.next();

    boolean flag = true;
    for (Integer key : data.getbookMap().keySet()) {
      if (data.getbookMap().get(key).getName().equals(name)
          && data.getbookMap().get(key).getPress().equals(press)) {
        flag = false;
        System.out.println(data.getbookMap().remove(key));
        System.out.println("|           删除成功         |");
        break;
      }
    }
    if (flag) {
      System.out.println("|          此书不存在          |");
    }
  }
}
