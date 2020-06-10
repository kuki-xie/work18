package homework4y.Book;

import java.util.HashMap;
import java.util.Map;

public class BookData {
  Map<Integer, Book> bookList = new HashMap<Integer, Book>();

  public BookData() {
    Book book1 = new Book("高等数学", false, "同济大学数学系", "同济大学出版社", 3);
    Book book2 = new Book("Java语言程序设计", false, "郎波", "清华大学出版社", 5);
    Book book3 = new Book("离散数学", true, "武波", "西安电子科技大学出版社", 2);
    bookList.put(1, book1);
    bookList.put(2, book2);
    bookList.put(3, book3);
  }

  public HashMap<Integer, Book> getBookList() {
    return (HashMap<Integer, Book>) bookList;
  }
}
