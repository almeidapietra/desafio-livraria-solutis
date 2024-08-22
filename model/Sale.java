package model;

public class Sale {
    private Book[] books;
    private String clientName;
    private Integer number;
    private Double price;

    public Sale(Book[] books, String clientName, Integer number, Double price) {
        this.books = books;
        this.clientName = clientName;
        this.number = number;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder booksList = new StringBuilder();
        for (Book book : books) {
            booksList.append(book.toString()).append("\n");
        }

        return "Sale{" +
                "books=\n" + booksList.toString() +
                ", clientName='" + getClientName() + '\'' +
                ", number=" + getNumber() +
                ", price=" + getPrice() +
                '}';
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
