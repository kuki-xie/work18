package homework4.Operations;

import homework4.Book.Book;
import homework4.Book.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

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
    System.out.println("|     请输入作者(逗号分开)      |");
    System.out.println("|----------------------------|");
    String str = in.next();
    String[] array = str.split("，");
    ArrayList<String> author = new ArrayList<String>();
    for (String element : array) {
      author.add(element);
    }

    System.out.println("|----------------------------|");
    System.out.println("|          请输入出版社        |");
    System.out.println("|----------------------------|");
    String press = in.next();

    boolean flag = true;
    int i = 0;
    Set<Entry<Integer, Book>> set = data.getbookMap().entrySet();
    Iterator<Entry<Integer, Book>> it = set.iterator();
    while (it.hasNext()) {
      i++;
      if (it.next().getValue().getName().equalsIgnoreCase(name)) {
        flag = false;
        data.getbookMap().remove(i);
        System.out.println("|           删除成功         |");
        break;
      }
    }
    if (flag) {
      System.out.println("|          此书不存在          |");
    }
  }
}
