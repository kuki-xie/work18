package homework4.Operations;

import com.sun.source.tree.WhileLoopTree;
import homework4.Book.Book;
import homework4.Book.Data;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

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
    System.out.println("|     请输入作者(，分开)      |");
    System.out.println("|----------------------------|");
    String str = in.next();
    String[] array = str.split("，");
    ArrayList<String> author = new ArrayList<>();
    for(String i:array){
      author.add(i);
    }
    System.out.println("|----------------------------|");
    System.out.println("|          请输入出版社        |");
    System.out.println("|----------------------------|");
    String press = in.next();

    System.out.println("|----------------------------|");
    System.out.println("|          请输入数量          |");
    System.out.println("|----------------------------|");
    int number = in.nextInt();

    Book change = null;
    boolean flag = true;
    int i = 0;
    Set<Entry<Integer, Book>> set= data.getbookMap().entrySet();
    Iterator<Entry<Integer, Book>> it = set.iterator();
    while (it.hasNext()) {
      i++;
      if (it.next().getValue().getName().equalsIgnoreCase(name)) {
        change = data.getbookMap().get(i);
        change.setNumber(number + change.getNumber());
        data.getbookMap().put(i, change);
        flag = false;
        System.out.println("|          老书添加成功          |");
        System.out.println(data.getbookMap().get(i).toString());
        System.out.println("key" + i);
        break;
      }
    }
    Book book = new Book(name, author, press, number);
    if (flag) {
      data.getbookMap().put(data.getbookMap().size() + 1, book);
      System.out.println("|          新书添加成功          |");
      System.out.println(data.getbookMap().get(data.getbookMap().size()).toString());
      System.out.println("key" + data.getbookMap().size());
    }
  }
}
