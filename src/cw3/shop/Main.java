package cw3.shop;

public class Main {

    public static void main(String[] args) {

        //tworzymy dwóch użytkowników
        Person Anitka = new Person("Anita", "Wasiak", 2000, 4000);
        Person Janek = new Person("Janek", "Powaga", 2000, 1000);

        //tworzymy produkty w sklepie
        Products tv = new Products("TV", ProductType.Electronic, 1000, 10);
        Products microwave = new Products("Microwave", ProductType.Electronic, 200, 20);
        Products snickers = new Products("Snickers", ProductType.Consumable, 5, 100);
        Products tickets = new Products("Bilet weekendowy Audioriver Festival", ProductType.Entertainment, 550, 15);

        //Anitka tworzy nowy koszyk
        Anitka.MakeOrder();
        Janek.MakeOrder();

        //Anitka dodaje produkty do koszyka
        Anitka.addToCart(tv);
        Anitka.addToCart(tickets);

        //Janek dodaje produkty do koszyka
        Janek.addToCart(snickers);
        Janek.addToCart(snickers);
        Janek.addToCart(snickers);
        Janek.addToCart(snickers);
        Janek.addToCart(snickers);
        Janek.addToCart(snickers);
        Janek.addToCart(snickers);
        Janek.addToCart(tickets);
        Janek.addToCart(tv);

        //zobaczmy co możemy zrobić z naszymi koszykami
        System.out.println("Zawartość koszyka Anitki: ");
        for (int i = 0; i < Anitka.Cart().products.size(); i++) {
            System.out.println(i + 1 + ". " + Anitka.Cart().products.get(i).getName());
        }
        System.out.println("Wartość koszyka Anitki: " + Anitka.Cart().totalPrice());
        System.out.println("|");
        System.out.println("Zawartość koszyka Janka: ");
        for (int i = 0; i < Janek.Cart().products.size(); i++) {
            System.out.println(i + 1 + ". " + Janek.Cart().products.get(i).getName());
        }
        System.out.println("Wartość koszyka Janka: " + Janek.Cart().totalPrice());
        System.out.println("|");
        Anitka.BuyInCash();
        System.out.println("Ile po zakupie: " + Anitka.getMoneyInCash());
        System.out.println("|");
        System.out.println("Zawartość koszyka Anitki w historii zamówień: ");
        for (int i = 0; i < Anitka.getHistory().get(0).products.size(); i++) {
            System.out.println(i + 1 + ". " + Anitka.getHistory().get(0).products.get(i).getName());
        }
    }
}

