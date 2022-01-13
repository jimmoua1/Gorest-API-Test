package demo.Assessment.OOP.TasksToDo8_fromWEBSITE.Excercise_2_OOP_Composition.Excercise_2_3;

public class Book {
    String isbn;
    String name;
    Author author;
    double price;
    int qty = 0;

    public Book(String isbn, String name, Author author, double price, int qty){
       this.isbn = isbn;
       this.name = name;
       this.author = author;
       this.price = price;
       this.qty = qty;
    }

    // getter
    public String getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // setter
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.name;
    }

    public String toString() {
        return "Book[" +
                "isbn=" + isbn +
                ",name=" + name +
                "," + author.toString() +
                ",price=" + price +
                ",qty=" + qty +
                ']';
    }
}
