package codecooler.michal.com.alcohol.wines;
import codecooler.michal.com.alcohol.Alcohol;

public abstract class Wines implements Alcohol {
    private String nameOfAlcohol = "Wine";
    private String typeOfAlcohol = "Wine";

    @Override
    public String levelOfExcise() {
        return "Second level of excise";

    }
    @Override
    public String hangoverOutcome() {
        return "Hangover effect";
    }

    @Override
    public String getNameOfAlcohol() {
        return this.nameOfAlcohol;
    }

    @Override
    public String getTypeOfAlcohol() {
        return this.typeOfAlcohol;
    }
}
