package codecooler.michal.com.alcohol.beers;
import codecooler.michal.com.alcohol.Alcohol;

public abstract class Beers implements Alcohol {
    private String nameOfAlcohol = "Beer";
    private String typeOfAlcohol = "Beer";

    @Override
    public String levelOfExcise() {
        return "First level of excise";
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
