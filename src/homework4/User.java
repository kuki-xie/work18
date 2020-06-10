package homework4;

import homework4.Book.Data;
import homework4.Operations.*;

import java.util.Scanner;

public class User {
  private static Operation[] operations;

  public User() {
    operations =
        new Operation[] {
          new searchBook(), new addBook(), new deleteBook(),
        };
  }

  public int menu() {
    System.out.println("|----------------------------|");
    System.out.println("|        请输入choice         |");
    System.out.println("|----------------------------|");
    System.out.println("|        0.查书               |");
    System.out.println("|        1.增书               |");
    System.out.println("|        2.删书               |");

    System.out.println("|----------------------------|");
    Scanner in = new Scanner(System.in);
    return in.nextInt();
  }

  public void Operate(int choice, Data data) {
    operations[choice].operation(data);
  }
}
