package mavenparctice;


class Book {
 String title;
  String author;
 double price;

 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 public void displayBookDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: $" + price);
 }
}

class Library {
 String libraryName;
 Book book; 

 public Library(String libraryName, Book book) {
     this.libraryName = libraryName;
     this.book = book;
 }

 public void displayLibraryDetails() {
     System.out.println("Library Name: " + libraryName);
     System.out.println("--- Cataloged Book ---");
     if (book != null) {
         book.displayBookDetails();
     } else {
         System.out.println("No book currently assigned.");
     }
 }
}

public class LibraryDemo {
 public static void main(String[] args) {
     Book book1 = new Book("Effective Java", "Joshua Bloch", 45.00);

     Library cityLibrary = new Library("Bangalore central Library", book1);

     cityLibrary.displayLibraryDetails();
 }
}