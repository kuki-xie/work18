package homework4.User;

import homework4.Operation.Operation;
import homework4.Operation.addBook;
import homework4.Operation.deleteBook;
import homework4.Operation.esc;
import homework4.Operation.searchBook;
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
    System.out.println("=====1.======");
    System.out.println("=====2.======");
    System.out.println("=====3.======");
    System.out.println("=====4.======");
    System.out.println("=============");
    Scanner in=new Scanner(System.in);
    int choice=in.nextInt();
    return choice;
  }
}
