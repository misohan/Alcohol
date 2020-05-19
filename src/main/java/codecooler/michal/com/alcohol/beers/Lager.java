package codecooler.michal.com.alcohol.beers;

public class Lager extends Beers {
    private String typeOfAlcohol = "Lager";

    @Override
    public String levelOfExcise() {
        return super.levelOfExcise();
    }

    @Override
    public String hangoverOutcome() {
        return "Amnesia";
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
