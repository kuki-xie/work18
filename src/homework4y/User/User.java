package homework4y.User;

import homework4y.Book.BookData;
import homework4y.Operation.Operation;


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
