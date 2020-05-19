package codecooler.michal.com.alcohol.vodka;

public class PureVodka extends Vodka {
    private String typeOfAlcohol = "Pure vodka";

    @Override
    public String levelOfExcise() {
        return super.levelOfExcise();
    }

    @Override
    public String hangoverOutcome() {
        return "Grass is growing too loud";
    }

    @Override
    public String getNameOfAlcohol() {
        return super.getNameOfAlcohol();
    }

    @Override
    public String getTypeOfAlcohol() {
        return this.typeOfAlcohol;
    }
}
