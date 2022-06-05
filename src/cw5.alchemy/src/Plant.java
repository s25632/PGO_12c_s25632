public class Plant extends Ingredient {

    private int toxicity;

    public Plant(String name, int reagent) {
        super(name, reagent);
    }

    public Plant(String name, int reagent, int toxicity) {
        super(name, reagent);
        setToxicity(toxicity);
    }

    public int getToxicity() {
        return toxicity;
    }

    public void setToxicity(int toxicity) {
        this.toxicity = toxicity;
    }

    public int getReagent() {
        return baseReagent * toxicity;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                ", toxicity=" + toxicity +
                "}";
    }
}
