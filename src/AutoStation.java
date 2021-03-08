import builders.BusTripBuilder;
import builders.TaxiTripBuilder;


public class AutoStation {

    public static void main(String[] args) {
        Director director = new Director();

        TaxiTripBuilder ttb = new TaxiTripBuilder();
        BusTripBuilder btb = new BusTripBuilder();

        System.out.println("----------------1-------------------");
        director.createBusTripWithFortyPassengers(btb);
        System.out.println("-----------------2------------------");
        director.createBusTripWithIncompetentDriver(btb);
        System.out.println("------------------3-----------------");
        director.createBusTripWithNoPassengers(btb);
        System.out.println("------------------4-----------------");
        director.createTaxiTripWithSixPassengers(ttb);

    }

}
