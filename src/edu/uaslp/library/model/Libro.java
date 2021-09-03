package edu.uaslp.library.model;

public class Libro {
    private String author;
    private String isbn;
    private String title;
    private String editorial;


    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
