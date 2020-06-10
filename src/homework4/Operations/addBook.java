package homework4.Operations;

import homework4.Book.Book;
import homework4.Book.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class addBook implements Operation {

  @Override
  public void operation(Data data) {
    Scanner in = new Scanner(System.in);
    System.out.println("----| Operation:addBook |----");
    System.out.println("|----------------------------|");
    System.out.println("|    Please input choice     |");
    System.out.println("|----------------------------|");

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

    Book book=new Book(name,author,press,number);
    boolean flag=false;
    for (Integer key:data.getbookMap().keySet()){
      if (data.getbookMap().get(key).getName().equals(name)
      &&data.getbookMap().get(key).getPress().equals(press)){
        flag=true;
        break;
      }

    }
  }
}
