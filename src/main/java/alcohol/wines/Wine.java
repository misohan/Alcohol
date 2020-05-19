package alcohol.wines;

import alcohol.Alcohol;

public abstract class Wine implements Alcohol {

    public String levelOfExcise() {
        return "Second level of excise";
    }

    public String hangoverOutcome() {
        return "Hangover effect";
    }
}