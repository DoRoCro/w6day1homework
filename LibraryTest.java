import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest {

  Library library;
  Book book;
  Borrower borrower;
  
  @Before
  public void before() {
    library = new Library("Alford", 1);
    book = new Book("Java for Dummies");
    borrower = new Borrower("Fox");
  } 


  @Test
  public void hasName() {
    assertEquals( "Alford", library.getName() );
  }

  @Test
  public void hasEmptyStockAtStart() {
    assertEquals( 0 , library.stockCount() );
  }

  @Test
  public void hasStockAfterAdd() {
    library.addBook(book);
    assertEquals(1, library.stockCount() );
  }

  @Test
  public void libraryIsFull() {
    library.addBook(book);
    assertEquals(true, library.isFull() );
  }

  @Test
  public void canLoanLastBook() {
    library.addBook(book);
    borrower.borrowBook( library.loanLastBook() );
    assertEquals("Java for Dummies", borrower.getBookByIndex(0).getName() ) ;
  }
}