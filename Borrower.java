public class Borrower {
// can borrow up 2 books at a time
  private String name;
  private Book[] borrowed;

  public Borrower(String name){
    this.name = name;
    this.borrowed = new Book[2];
  }

  public String getName() {
    return this.name ;
  }


}