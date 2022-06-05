import java.util.ArrayList;
import java.util.List;

public class Elixir {

    private String name;
    private boolean isCreated = false;
    private int power;
    private Liquid catalyst;
    List<Ingredient> ingredients = new ArrayList<>();

    public Elixir(String name) {
        setName(name);
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

    public boolean isCreated() {
        return isCreated;
    }

    public int getPower() {
        return power;
    }

    public Liquid getCatalyst() {
        return catalyst;
    }

    public void setCatalyst(Liquid catalyst) {
        if (isCreated) {
            throw new RuntimeException("Elixir is already created.");
        }
        this.catalyst = catalyst;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient i) {
        if (isCreated) {
            throw new RuntimeException("Elixir is already created.");
        }
        ingredients.add(i);
    }

    public void removeIngredient(Ingredient i) {
        if (isCreated) {
            throw new RuntimeException("Elixir is already created.");
        }
        ingredients.remove(i);

    }

    public void Create() {
        if (isCreated) {
            throw new RuntimeException("Elixir is already created.");
        }
        for (int i = 0; i < ingredients.size(); i++) {
            this.power += ingredients.get(i).getReagent();
        }
        this.power = this.power / catalyst.getReagent();
        this.isCreated = true;
    }

    @Override
    public String toString() {
        return "Elixir{" +
                "name='" + name + '\'' +
                ", isCreated=" + isCreated +
                ", power=" + power +
                ", catalyst=" + catalyst +
                ", ingredients=\n" + ingredients +
                "}";
    }
}
