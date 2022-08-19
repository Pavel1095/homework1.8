import java.util.Objects;

public class Book {

    private final String title;
    private int publishDate;
    private final Author author;

    public Book (String title, int publishDate, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public Author getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return String.format("Книга \"%s\", год публикации \"%s\", автор \"%s\"", title, publishDate, author);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishDate == book.publishDate && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

