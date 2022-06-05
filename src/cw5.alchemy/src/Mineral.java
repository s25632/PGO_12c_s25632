public class Mineral extends Ingredient {

    private int power;

    public Mineral(String name, int reagent) {
        super(name, reagent);
    }

    public Mineral(String name, int reagent, int power) {
        super(name, reagent);
        setPower(power);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) {
            throw new RuntimeException("Value cannot be negative.");
        }
        this.power = power;
    }

    public int getReagent() {
        return baseReagent + power;
    }

    @Override
    public String toString() {
        return "Mineral{" +
                "name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                ", power=" + power +
                "}";
    }
}
