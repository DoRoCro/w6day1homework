public class Library {
  private String name; 
  private Book[] stock;

  public Library(String name, int bookCapacity) {
     this.name = name;
     this.stock = new Book[bookCapacity];
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
}