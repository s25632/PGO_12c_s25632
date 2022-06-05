public class Liquid extends Ingredient {

    protected int solubility;

    public Liquid(String name, int reagent) {
        super(name, reagent);
    }

    public Liquid(String name, int reagent, int solubility) {
        super(name, reagent);
        setSolubility(solubility);
    }

    public int getSolubility() {
        return solubility;
    }

    public void setSolubility(int solubility) {
        if (solubility < 1 || solubility > 100) {
            throw new RuntimeException("Value must be between 1-100%");
        }
        this.solubility = solubility;
    }

    public int getReagent() {
        return solubility;
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                ", solubility=" + solubility +
                "}";
    }
}
