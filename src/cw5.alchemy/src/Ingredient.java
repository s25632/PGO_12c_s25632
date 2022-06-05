public class Ingredient {

    protected String name;
    protected int baseReagent;

    public Ingredient(String name, int baseReagent) {
        setName(name);
        setReagent(baseReagent);
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

    public int getReagent() {
        return baseReagent;
    }

    public void setReagent(int baseReagent) {
        if (baseReagent < 0) {
            throw new RuntimeException("Value cannot be negative.");
        }
        this.baseReagent = baseReagent;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                "}";

    }
}
