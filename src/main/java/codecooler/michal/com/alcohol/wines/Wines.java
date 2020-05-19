package codecooler.michal.com.alcohol.wines;

import codecooler.michal.com.alcohol.Alcohol;

public abstract class Wines implements Alcohol {

    public Wines() {
    }

    public String levelOfExcise() {
        try {
            return "Second level of excise";
        } catch (Exception e){
            System.out.println(e);
        }
        return "Second level of excise";

    }

    public String hangoverOutcome() {
        return "Hangover effect";
    }
}
