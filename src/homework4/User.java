package homework4;

import homework4.Book.Data;
import homework4.Operations.*;

import java.util.Scanner;

public class User {
  public static int menu() {
    System.out.println("|----------------------------|");
    System.out.println("|        请输入choice         |");
    System.out.println("|----------------------------|");
    System.out.println("|        0.查书               |");
    System.out.println("|        1.增书               |");
    System.out.println("|        2.删书               |");
    System.out.println("|        3.退出               |");
    System.out.println("|----------------------------|");
    Scanner in = new Scanner(System.in);
    return in.nextInt();
  }
  public static void main(String[] args){
    Data data=new Data();
    while (true){

    switch (menu()){
      case 1:
        new addBook().operation(data);
        break;
      case 0:
        new searchBook().operation(data);
        break;
      case 2:
        new deleteBook().operation(data);
        break;
      case 3:
        System.exit(0);
        break;
    }
    }
  }


}
