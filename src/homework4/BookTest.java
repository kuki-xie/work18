package homework4;

import homework4.Book.Data;

public class BookTest {
  public static void main(String[] args) {
    User user=new User();
    Data data=new Data();
    while (true) {
      user.Operate(user.menu(), data);
    }
  }
}
