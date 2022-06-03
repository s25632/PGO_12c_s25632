package cw2.library;

public class Main {
    public static void main(String[] args) {

        //tworzenie nowego użytkownika
        Person Janek = new Person("Jan", "Powaga", "01 06 1996", "Polska", "Warszawa", "Marymoncka", 100, 2);

        //tworzenie książki
        Book book1 = new Book("Przygody Janka", Janek, Genre.Classic, Lang.Polish, "01 06 2021");
        System.out.println("book1: " + book1);

        //publikowanie książki przez użytkownika
        Book book2 = Janek.PublishBook();
        System.out.println("book2: " + book2);

        //wypozyczenie ksiażki
        book2.BorrowBook(Janek);

        //sprawdzenie dostępności book2 i przez kogo zostala wypozyczona
        System.out.println("Czy book2 jest dostępna: " + book2.isAvailable());
        System.out.println("boo2 jest wypożyczona przez: " + book2.getBorrowedBy());

        //zwrot książki
        book2.PlaceBack();

        //ponowne sprawdzenie dostepnosci i czy jest przez kogos wypozyczona
        System.out.println("Czy book2 jest dostępna: " + book2.isAvailable());
        System.out.println("book2 jest wypożyczona przez: " + book2.getBorrowedBy());
    }
}