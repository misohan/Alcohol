package alcohol.vodka;

import alcohol.Alcohol;

public abstract class Vodka implements Alcohol {

    public String levelOfExcise() {
        return "Third level of excise";
    }

    public String hangoverOutcome() {
        return "Hangover effect";
    }
}
