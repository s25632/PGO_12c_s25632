public class Crystal extends Mineral {

    private int magicPower;

    public Crystal(String name, int reagent) {
        super(name, reagent);
    }

    public Crystal(String name, int reagent, int power) {
        super(name, reagent, power);
    }

    public Crystal(String name, int reagent, int power, int magicPower) {
        super(name, reagent, power);
        setMagicPower(magicPower);
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getReagent() {
        return super.getReagent() + magicPower;
    }

    @Override
    public String toString() {
        return "Crystal{" +
                "magicPower=" + magicPower +
                ", name='" + name + '\'' +
                ", baseReagent=" + baseReagent +
                "}";
    }
}
