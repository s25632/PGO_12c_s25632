package cw2.library;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Book {

    private long id;
    private static long idCounter = 0;
    private String name = "Untitled";
    private List<Person> author = new ArrayList<>();
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int Age;
    private int borrowCount = 0;
    private boolean isAvailable = true;
    private Person borrowedBy;

    public Book(Person author) {
        setId();
        addAuthor(author);
    }

    public Book(String name, Person author, Genre genre, Lang language) {
        setId();
        this.setName(name);
        this.addAuthor(author);
        this.setGenre(genre);
        this.setLanguage(language);
        this.isAvailable = true;
    }

    public Book(String name, Person author, Genre genre, Lang language, String publishDate) {
        setId();
        this.setName(name);
        this.addAuthor(author);
        this.setGenre(genre);
        this.setLanguage(language);
        setPublishDate(publishDate);
        setAge(getPublishDate().until(LocalDate.now(ZoneId.of("Europe/Warsaw"))).getYears());
        this.isAvailable = true;
    }

    public long getId() {
        return id;
    }

    public void setId() {
        this.id = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name cannot be empty.");
        }
        this.name = name;
    }

    public String getAuthor() {
        return author.stream().map(Object::toString).collect(Collectors.joining(", "));
    }

    public void addAuthor(Person author) {
        if (author == null) {
            throw new RuntimeException("Author must be specified.");
        }
        this.author.add(author);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        if (genre == null) {
            throw new RuntimeException("Genre must be specified.");
        }
        this.genre = genre;
    }

    public Lang getLanguage() {
        return language;
    }

    public void setLanguage(Lang language) {
        if (language == null) {
            throw new RuntimeException("Language must be specified.");
        }
        this.language = language;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        if (publishDate == null || publishDate.isEmpty()) {
            throw new RuntimeException("Publish date cannot be empty.");
        }
        this.publishDate = LocalDate.parse(publishDate, DateTimeFormatter.ofPattern("dd MM yyyy"));
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Age cannot be a negative value.");
        }
        Age = age;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public Person getBorrowedBy() {
        return borrowedBy;
    }

    public void BorrowBook(Person person) {
        person.setBorrowedBook(this);
        this.borrowedBy = person;
        this.borrowCount++;
        this.isAvailable = false;
    }

    public void PlaceBack() {
        this.borrowedBy.setBorrowedBook(null);
        this.borrowedBy = null;
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", genre=" + genre +
                ", language=" + language +
                ", publishDate=" + publishDate +
                ", Age=" + Age +
                ", borrowCount=" + borrowCount +
                ", isAvailable=" + isAvailable +
                ", borrowedBy=" + borrowedBy +
                '}';
    }
}
