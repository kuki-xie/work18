package homework4.Operations;

import homework4.Book.Data;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;


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
      if(choice==0){
        System.exit(0);
      }
      switch (choice) {
        case 1:
          boolean flag = true;
          System.out.println("|----------------------------|");
          System.out.println("|        请输入书名            |");
          System.out.println("|----------------------------|");
          String name = in.next();
          for (Integer key : data.getbookMap().keySet()) {
            if (data.getbookMap().get(key).getName().equals(name)) {
              System.out.println("|----------------------------|");
              System.out.println("|           已找到            |");
              System.out.println("|----------------------------|");
              flag = false;
              System.out.println(data.getbookMap().get(key).toString());
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
          System.out.println("|        请输入作者            |");
          System.out.println("|----------------------------|");
          String str = in.next();
          String[] array = str.split(" ");
          flag = true;
          for (Integer key : data.getbookMap().keySet()) {
            for (String element : array) {
              if (data.getbookMap().get(key).getAuthor().contains(element)) {
                System.out.println("|----------------------------|");
                System.out.println("|           已找到            |");
                System.out.println("|----------------------------|");
                flag = false;
                System.out.println(data.getbookMap().get(key).toString());
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
          for (Integer key : data.getbookMap().keySet()) {
            if (data.getbookMap().get(key).getPress().equals(press)) {
              System.out.println("|----------------------------|");
              System.out.println("|           已找到            |");
              System.out.println("|----------------------------|");
              flag = false;
              System.out.println(data.getbookMap().get(key).toString());
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
