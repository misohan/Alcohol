package codecooler.michal.com;

import codecooler.michal.com.alcohol.Alcohol;
import codecooler.michal.com.alcohol.beers.Porter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Alcohol> alcohols = new ArrayList<Alcohol>();
        


        try {
            for (Alcohol alcohol: alcohols){
                System.out.println(alcohol.hangoverOutcome());
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
