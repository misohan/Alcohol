package codecooler.michal.com.alcohol.beers;
import codecooler.michal.com.alcohol.Alcohol;

public abstract class Beers implements Alcohol {

    public Beers() {
    }

    public String levelOfExcise() {
        return "First level of excise";
    }

    public String hangoverOutcome() {
        return "Hangover effect";
    }
}
