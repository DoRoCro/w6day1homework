import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest {

  Library library;
  Book book;
  
  @Before
  public void before() {
    library = new Library("Alford", 1);
    book = new Book("Java for Dummies");
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

}