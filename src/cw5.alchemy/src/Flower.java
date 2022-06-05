public class Flower extends Plant {

    public Flower(String name, int reagent) {
        super(name, reagent);
    }

    public Flower(String name, int reagent, int toxicity) {
        super(name, reagent, toxicity);
    }

    public int getReagent() {
        return super.getReagent() * 2;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                "}";
    }
}
