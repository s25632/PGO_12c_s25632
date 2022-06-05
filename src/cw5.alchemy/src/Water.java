public class Water extends Liquid {

    private boolean distilled;

    public Water(String name, int reagent) {
        super(name, reagent);
    }

    public Water(String name, int reagent, int solubility) {
        super(name, reagent, solubility);
    }

    public Water(String name, int reagent, int solubility, boolean distilled) {
        super(name, reagent, solubility);
        setDistilled(distilled);
    }

    public boolean isDistilled() {
        return distilled;
    }

    public void setDistilled(boolean distilled) {
        this.distilled = distilled;
    }

    public int getReagent() {
        if (distilled) {
            return solubility;
        }
        else {
            return solubility / 2;
        }
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                ", solubility=" + solubility +
                ", distilled=" + distilled +
                "}";
    }
}
