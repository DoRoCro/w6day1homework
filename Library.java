public class Library {
  private String name; 
  private Book[] stock;
  private Book[] onloan;

  public Library(String name, int bookCapacity) {
     this.name = name;
     this.stock = new Book[bookCapacity];
     this.onloan = new Book[bookCapacity];
  }

  public String getName() {
    return this.name ;
  }

  public int stockCount() {
    int count = 0;
    for ( Book book : stock) {
      if ( stock[count] != null ) {
        count++;
      }
    }
    return count;
  }

  public void addBook(Book book) {
    int index = stockCount();
    stock[index] = book;
  }

  public boolean isFull() {
    return stockCount() >= stock.length ;
  }

  public Book loanLastBook(){
    int index = stockCount();
    Book book = stock[index-1]; 
    stock[index-1] = null;
    return book;
  }
}