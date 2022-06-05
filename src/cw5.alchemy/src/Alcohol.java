public class Alcohol extends Liquid {

    private int percent;

    public Alcohol(String name, int reagent) {
        super(name, reagent);
    }

    public Alcohol(String name, int reagent, int solubility) {
        super(name, reagent, solubility);
    }

    public Alcohol(String name, int reagent, int solubility, int percent) {
        super(name, reagent, solubility);
        setPercent(percent);
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if (percent < 0 || percent > 100) {
            throw new RuntimeException("Value must be between 0-100%");
        }
        this.percent = percent;
    }

    public int getReagent() {
        return (super.getReagent() * this.percent) / 100;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "percent=" + percent +
                ", name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                ", solubility=" + solubility +
                "}";
    }
}

