package homework4.Operations;

import homework4.Book.Book;
import homework4.Book.Data;
import java.util.ArrayList;
import java.util.Scanner;



public class addBook extends Operation {

  @Override
  public void operation(Data data) {
    System.out.println("----| Operation:addBook |----");
    System.out.println("|----------------------------|");
    System.out.println("|          已有图书           |");
    System.out.println("|----------------------------|");

    for (Integer key : data.getbookMap().keySet()) {
      System.out.println(data.getbookMap().get(key).toString());
    }
    Scanner in = new Scanner(System.in);

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

    System.out.println("|----------------------------|");
    System.out.println("|          请输入数量          |");
    System.out.println("|----------------------------|");
    int number = in.nextInt();

    Book book = new Book(name, author, press, number);
    boolean flag = true;
    for (Integer key : data.getbookMap().keySet()) {
      if (data.getbookMap().get(key).getName().equalsIgnoreCase(name)
          && data.getbookMap().get(key).getPress().equalsIgnoreCase(press)) {
        flag = false;
        data.getbookMap().get(key).number1=;
        System.out.println("|          老书添加成功          |");
        System.out.println(data.getbookMap().get(key).toString());
        break;
      }
      if (flag) {
        data.getbookMap().put(data.getbookMap().size() + 1, book);
        System.out.println("|          新书添加成功          |");
      }
    }
  }
}
