public class Borrower {
// can borrow up 2 books at a time
  private String name;
  private Book[] borrowed;

  public Borrower(String name){
    this.name = name;
    this.borrowed = new Book[3];
  }

  public String getName() {
    return this.name ;
  }

  public int borrowedCount() {
    int count = 0;
    for ( Book book : borrowed) {
      if ( borrowed[count] != null ) {
        count++;
      }
    }
    return count;
  }

  public void borrowBook( Book book) {
    int index = borrowedCount();
    borrowed[index] = book;
  }

  public boolean isFull() {
    return borrowedCount() >= borrowed.length ;
  }

  public Book getBookByIndex(int index){
    return borrowed[index];
  }
}