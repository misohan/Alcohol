package codecooler.michal.com.alcohol.vodka;
import codecooler.michal.com.alcohol.Alcohol;

public abstract class Vodka implements Alcohol {
    private String nameOfAlcohol = "Vodka";
    private String typeOfAlcohol = "Vodka";

    @Override
    public String levelOfExcise() {
        return "Third level of excise";
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
