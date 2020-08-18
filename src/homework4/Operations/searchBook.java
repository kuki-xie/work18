package homework4.Operations;

import homework4.Book.Book;
import homework4.Book.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class searchBook extends Operation {

  @Override
  public void operation(Data data) {
    Scanner in = new Scanner(System.in);
    System.out.println("|----------------------------|");
    System.out.println("|          已有图书           |");
    System.out.println("|----------------------------|");

    for (Integer key : data.getbookMap().keySet()) {
      System.out.println(data.getbookMap().get(key).toString());
    }
    while (true) {
      System.out.println("|----------------------------|");
      System.out.println("|        请输入choice         |");
      System.out.println("|----------------------------|");
      System.out.println("|        1.按书名查找          |");
      System.out.println("|        2.按作者查找          |");
      System.out.println("|        3.按出版社查找        |");
      System.out.println("|        0.退出               |");
      System.out.println("|----------------------------|");
      int choice = in.nextInt();
      if (choice == 0) {
        System.exit(0);
      }
      switch (choice) {
        case 1:
          boolean flag = true;
          System.out.println("|----------------------------|");
          System.out.println("|        请输入书名            |");
          System.out.println("|----------------------------|");
          String name = in.next();

          int i = 0;
          Set<Entry<Integer, Book>> set1 = data.getbookMap().entrySet();
          Iterator<Entry<Integer, Book>> it1 = set1.iterator();
          while (it1.hasNext()) {
            i++;
            if (it1.next().getValue().getName().contains(name)) {
              System.out.println("|----------------------------|");
              System.out.println("|           已找到            |");
              System.out.println("|----------------------------|");
              flag = false;
              System.out.println(data.getbookMap().get(i).toString());
            }
          }
          if (flag) {
            System.out.println("|----------------------------|");
            System.out.println("|           未找到            |");
            System.out.println("|----------------------------|");
          }
          break;

        case 2:
          System.out.println("|----------------------------|");
          System.out.println("|        请输入作者(逗号隔开)            |");
          System.out.println("|----------------------------|");
          ArrayList<String> author=new ArrayList<>();
          String str = in.next();
          String[] array = str.split("，");
          flag = true;
          i = 0;
          Set<Entry<Integer, Book>> set2 = data.getbookMap().entrySet();
          Iterator<Entry<Integer, Book>> it2 = set2.iterator();
          while (it2.hasNext()) {
            i++;
            for (String element : array) {
              if (it2.next().getValue().getAuthor().contains(element)) {
                System.out.println("|----------------------------|");
                System.out.println("|           已找到            |");
                System.out.println("|----------------------------|");
                flag = false;
                System.out.println(it2.next().getValue().toString());
              }
            }
          }
          if (flag) {
            System.out.println("|----------------------------|");
            System.out.println("|           未找到            |");
            System.out.println("|----------------------------|");
          }
          break;
        case 3:
          flag = true;
          System.out.println("|----------------------------|");
          System.out.println("|        请输入出版社            |");
          System.out.println("|----------------------------|");
          String press = in.next();
          i = 0;
          Set<Entry<Integer, Book>> set3 = data.getbookMap().entrySet();
          Iterator<Entry<Integer, Book>> it3 = set3.iterator();
          while (it3.hasNext()) {
            i++;

            if (it3.next().getValue().getName().contains(press)) {
              System.out.println("|----------------------------|");
              System.out.println("|           已找到            |");
              System.out.println("|----------------------------|");
              flag = false;
              System.out.println(data.getbookMap().get(i).toString());
            }
          }
          if (flag) {
            System.out.println("|----------------------------|");
            System.out.println("|           未找到            |");
            System.out.println("|----------------------------|");
          }
          break;
        default:
          break;
      }
    }
  }
}
