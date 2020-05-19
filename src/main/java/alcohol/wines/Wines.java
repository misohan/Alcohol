package alcohol.wines;

import alcohol.Alcohol;

public abstract class Wines implements Alcohol {

    public String levelOfExcise() {
        return "Second level of excise";
    }

    public String hangoverOutcome() {
        return "Hangover effect";
    }
}
