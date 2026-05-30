public class Book implements Comparable<Book> {
    private String name;
    private int numberOfPages;
    private String author;
    private String publicationDate;

    public Book(String name, int numberOfPages, String author, String publicationDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }


    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

}

