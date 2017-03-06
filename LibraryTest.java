import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest {

  Library library;
  // Book book;
  
  @Before
  public void before() {
    library = new Library("Alford");
    // book = new Book("Java for Dummies");
  } 


  @Test
  public void hasName() {
    assertEquals( "Alford", library.getName() );
  }





}