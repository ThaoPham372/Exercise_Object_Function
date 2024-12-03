import java.util.Scanner;
public class Book {
  // Attribute
  private String idBook;
  private String nameBook;
  private String author;
  private int quantity;

  //Construtor
  public Book(String idBook, String nameBook, String author, int quantity) {
    this.idBook = idBook;
    this.nameBook = nameBook;
    this.author = author;
    this.quantity = quantity;
  }

  // Getter, Setter
  public String getIdBook() {
    return idBook;
  }

  public void setIdBook(String idBook) {
    this.idBook = idBook;
  }

  public String getNameBook() {
    return nameBook;
  }

  public void setNameBook(String nameBook) {
    this.nameBook = nameBook;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
 
  //Method
  @Override
  public String toString() {
    return "[Id:" + idBook + ", Name:" + nameBook + ", Author:" + author + ", Quantity:" + quantity + "]";
  }
}
