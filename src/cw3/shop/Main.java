package cw3.shop;

public class Main {

    public static void main(String[] args) {

        Person Janek = new Person ("Jan", "Powaga", 1000, 200);

        Products tv = new Products("TV", ProductType.Electronic, 500, 5);
        Products microwave = new Products("Microwave", ProductType.Electronic, 200, 10);
        Products candybar = new Products("Candy Bar", ProductType.Consumable, 2, 100);
        Products sandwich = new Products("PB&J Sandwich", ProductType.Consumable, 5, 80);
        Products tickets = new Products("Cinema Tickets", ProductType.Entertainment, 20, 50);
        Products netflix = new Products("Netflix Monthly Subscription", ProductType.Entertainment, 30, 1000);

        Storage storage_1 = new Storage(2);
        Storage storage_2 = new Storage(5);

        //dodanie produktów do magazynu
        tv.setStorage(storage_1);
        microwave.setStorage(storage_1);
        candybar.setStorage(storage_2);
        sandwich.setStorage(storage_2);

        //sprawdzenie czasów dostawy
        System.out.println("Czas dostawy TV: " + tv.getDeliveryTime());
        System.out.println("Czas dostawy batonika: " + candybar.getDeliveryTime());
        System.out.println("Czas dostawy biletów: " + tickets.getDeliveryTime());


        //inicjowanie nowego produktu z dodaniem do magazynu
        Products iphone = new Products("Apple iPhone", ProductType.Electronic, 999, 2, storage_1);

        Janek.MakeOrder();
        Janek.addToCart(tv);
        Janek.addToCart(candybar);
        Janek.addToCart(netflix);

        //sprawdzenie zawartości koszyka
        System.out.println("Zawartość koszyka: " + Janek.Cart());

        //usunięcie produktu
        Janek.removeFromCart(candybar);

        //ponowne sprawdzenie zawartości koszyka
        System.out.println("Zawartość koszyka po usunięciu: " + Janek.Cart());

        try {
            Janek.BuyByCard();
        }
        catch (RuntimeException e) {
            System.out.println(e);
        }

        //brak środków, więc kupujemy w gotówce
        Janek.BuyInCash();

        //sprawdzamy ilość dostępnych pieniędzy i czy koszyk trafił do historii
        System.out.println(Janek);

        //sprawdzamy ilość dostępnych produktów po zakupie
        System.out.println("Ilość dostępnych TV (było 5): " + tv.getQuantity());
        System.out.println("Ilość dostępnych subskrypcji (było 1000): " + netflix.getQuantity());

        //zwiększamy ilość produktu
        tv.IncreaseQuantity(5);
        System.out.println("Ilość dostępnych TV po zwiększeniu (było 4): " + tv.getQuantity());


        //tworzymy nowy koszyk i sprawdzamy ID koszyków
        Janek.MakeOrder();
        System.out.println("ID pierwszego koszyka: " + Janek.getHistory().get(0).getId());
        System.out.println("ID drugiego koszyka: " + Janek.Cart().getId());


    }
}

