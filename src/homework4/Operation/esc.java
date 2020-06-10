package homework4.Operation;

import homework4.Book.BookData;

public class esc implements Operation{

  @Override
  public void opear(BookData bd) {
    System.out.println("退出");
    System.exit(0);
  }
}
