
public class Main {

  public static void printBookInfo(Book book) {
    System.out.println(book.author + "\n" + book.title + "\n");
    System.out.println("Page format: " + book.pageFormat + ", " + book.pagesAmount + " pages\n");
    System.out.println(book.contents);
  }

  public static void main(String[] args) {
    Book book = new Book();
    book.author = "J.K. Rowling";
    book.title = "Harry Potter and Philosopher Stone";
    book.contents = "The boy who lived";
    book.pageFormat = "A5";
    book.pagesAmount = 400;
    printBookInfo(book);
  }
}
