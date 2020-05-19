package codecooler.michal.com.alcohol.beers;

public class Porter extends Beers {
    private String typeOfAlcohol = "Porter";

    @Override
    public String levelOfExcise() {
        return super.levelOfExcise();
    }

    @Override
    public String hangoverOutcome() {
        return "Massive headache";
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
