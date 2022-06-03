package cw2.library;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private int Age;
    private Address address;
    private Book borrowedBook;

    public Person(String name, String surname, String date, String country, String city, String street, int house, int flat) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd MM yyyy"));
        this.Age = dateOfBirth.until(LocalDate.now(ZoneId.of("Europe/Warsaw"))).getYears();
        this.address = new Address(country, city, street, house, flat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name must be specified.");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new RuntimeException("Surname must be specified.");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return Age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String country, String city, String street, int house, int flat) {
        this.address = new Address(country, city, street, house, flat);
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public Book PublishBook() {
        return new Book(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", Age=" + Age +
                ", address=" + address +
                '}';
    }
}
