public class Main {
    public static void main(String[] args) {

        //tworzenie składnikow
        Alcohol alcohol = new Alcohol("Alcohol", 10, 100, 70);
        Ore ore = new Ore("Ore", 15, 5, true);
        Crystal crystal = new Crystal("Crystal", 20, 6, 2);
        Flower flower = new Flower("Flower", 5, 3);
        Root root = new Root("Root", 25, 0);

        //rozpoczecie pracy z eliksirem
        Elixir elixir = new Elixir("Elixir");

        //dodawanie składników
        elixir.setCatalyst(alcohol);
        elixir.addIngredient(ore);
        elixir.addIngredient(crystal);
        elixir.addIngredient(flower);
        elixir.addIngredient(root);

        //usuwanie składników
        elixir.removeIngredient(root);

        //tworzenie eliksiru
        elixir.Create();

        //drukowanie gotowego eliksiru
        System.out.println(elixir);

    }
}
