package homework4.User;

import homework4.Book.BookData;

public class libraryTest {
  public static void main(String[] args){
    reader r=new reader("Edge");
    BookData bd=new BookData();
    while (true){
      r.doOperation(r.menu(),bd);
    }
  }
}
