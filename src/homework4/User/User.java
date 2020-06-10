package homework4.User;

import homework4.Book.BookData;
import homework4.Operation.Operation;


public abstract class User {
  protected String name;
  protected Operation[] operations;
  public User(String name){
    this.name=name;
  }
  abstract public int menu();
  public void doOperation(int choice, BookData bookList){
    operations[choice].opear(bookList);
  }

}
