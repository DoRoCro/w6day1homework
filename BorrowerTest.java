import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BorrowerTest {
  
  Borrower borrower;

  @Before
  public void before() {
    borrower = new Borrower("Fritz");
  } 

  @Test
  public void hasName() {
    assertEquals("Fritz", borrower.getName() );
  }
}