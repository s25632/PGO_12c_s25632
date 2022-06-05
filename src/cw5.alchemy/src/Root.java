public class Root extends Plant {

    public Root(String name, int reagent) {
        super(name, reagent);
    }

    public Root(String name, int reagent, int toxicity) {
        super(name, reagent, toxicity);
    }

    public int getReagent() {
        return super.getReagent() / 2;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                "}";
    }
}
