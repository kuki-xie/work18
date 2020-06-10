package homework4y.User;

import homework4y.Operation.Operation;
import homework4y.Operation.addBook;
import homework4y.Operation.deleteBook;
import homework4y.Operation.esc;
import homework4y.Operation.searchBook;
import java.util.Scanner;

public class reader extends User{
  public reader(String name){
    super(name);
    operations=new Operation[]{
        new esc(),
        new searchBook(),
        new addBook(),
        new deleteBook(),
    };
  }

  @Override
  public int menu() {
    System.out.println("请输入选择");
    System.out.println("=============");
    System.out.println("=====0.退出======");
    System.out.println("=====1.查书======");
    System.out.println("=====2.增书======");
    System.out.println("=====3.删书======");
    System.out.println("=============");
    Scanner in=new Scanner(System.in);
    return in.nextInt();
  }
}
