package homework4y.User;

import homework4y.Book.BookData;

public class libraryTest {
  public static void main(String[] args){
    reader r=new reader("Edge");
    BookData bd=new BookData();
    while (true) {
      r.doOperation(r.menu(), bd);
    }
  }
}
