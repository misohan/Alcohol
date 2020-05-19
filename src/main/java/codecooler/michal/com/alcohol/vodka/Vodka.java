package codecooler.michal.com.alcohol.vodka;

import codecooler.michal.com.alcohol.Alcohol;

public abstract class Vodka implements Alcohol {

    public Vodka() {
    }

    public String levelOfExcise() {
        return "Third level of excise";
    }

    public String hangoverOutcome() {
        return "Hangover effect";
    }
}
