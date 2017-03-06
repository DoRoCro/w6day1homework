import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BookTest {

  Book book;
  
  @Before
  public void before() {
    book = new Book("Java for Dummies");
  } 


  @Test
  public void hasName(){
    assertEquals( "Java for Dummies", book.getName() );
  }





}