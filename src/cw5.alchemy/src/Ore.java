public class Ore extends Mineral {

    private boolean metallic;

    public Ore(String name, int reagent) {
        super(name, reagent);
    }

    public Ore(String name, int reagent, int power) {
        super(name, reagent, power);
    }

    public Ore(String name, int reagent, int power, boolean metallic) {
        super(name, reagent, power);
        setMetallic(metallic);
    }

    public boolean isMetallic() {
        return metallic;
    }

    public void setMetallic(boolean metallic) {
        this.metallic = metallic;
    }

    public int getReagent() {
        if (metallic) {
            return super.getReagent();
        }
        else {
            return super.getReagent() / 2;
        }
    }

    @Override
    public String toString() {
        return "Ore{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                ", metallic=" + metallic +
                "}";
    }
}
