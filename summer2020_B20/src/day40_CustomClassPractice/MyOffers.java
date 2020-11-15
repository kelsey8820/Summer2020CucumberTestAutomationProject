package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setOfferInfo(105000, "VA", true, true, true, "SDET", true);
        offer2.setOfferInfo(175_000,"VA",true,true, false, "SDET", true);
        offer3.setOfferInfo(125000,"VA", true, true, true, "SDET", true);
        offer4.setOfferInfo(130_000,"PA",true,false, false, "QA", true);
        offer5.setOfferInfo(100_000,"CA",true,false, false, "QA", true);
        offer6.setOfferInfo(120000,"CO",true,true,true,"Senior SDET",true);
        offer7.setOfferInfo(110_000,"GA",true,false, false, "QA", true);


        ArrayList<Offer> jobOffers = new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));

        for(Offer eachOffer :jobOffers){
            eachOffer.getOfferInfo();
        }

        System.out.println("==============================================");

        // remove offers that are less than 120,000

      //  jobOffers.removeIf( p -> p.salary < 120000);
      //  System.out.println("Number of offers: "+ jobOffers.size());

        String myLocation = "VA";
        // if the offer is less than 120,000 or not from my local area, then I need to remove that offer

        //jobOffers.removeIf( p -> p.salary < 12000 || !p.state.equals("VA"));
       // System.out.println("Number of offers: "+ jobOffers.size());

        // remove all offers that do not have PTO, benefits, or is not full time

        jobOffers.removeIf( p -> p.hasPTO == false || p.hasBenefit == false || p.isFullTime == false || p.salary < 120000);
        System.out.println("Number of offers: "+ jobOffers.size());






    }

}
