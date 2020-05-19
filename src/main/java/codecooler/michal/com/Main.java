package codecooler.michal.com;

import codecooler.michal.com.alcohol.Alcohol;
import codecooler.michal.com.alcohol.beers.Lager;
import codecooler.michal.com.alcohol.beers.Porter;
import codecooler.michal.com.alcohol.vodka.PureVodka;
import codecooler.michal.com.alcohol.wines.WhiteWine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Alcohol> alcohols = new ArrayList<>();
        alcohols.add(new Lager());
        alcohols.add(new Porter());
        alcohols.add(new WhiteWine());
        alcohols.add(new PureVodka());



        try {
            for (Alcohol alcohol: alcohols){
                System.out.println(alcohol.hangoverOutcome());
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
