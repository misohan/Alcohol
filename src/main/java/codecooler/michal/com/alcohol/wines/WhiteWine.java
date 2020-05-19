package codecooler.michal.com.alcohol.wines;

public class WhiteWine extends Wines {
    private String typeOfAlcohol = "White wine";

    @Override
    public String levelOfExcise() {
        return super.levelOfExcise();

    }
    @Override
    public String hangoverOutcome() {
        return "Helicopter effect";
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
