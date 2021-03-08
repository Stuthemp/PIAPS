import builders.Builder;
import drivers.Driver;
import drivers.licenceType;
import passengers.BusPassenger;
import passengers.TaxiPassenger;
import passengers.passengerType;

public class Director {

    public void createBusTripWithFortyPassengers(Builder builder){

        builder.setSeatsLimit();
        builder.setDriver(new Driver(licenceType.D));
        boolean continueCycle = true;

        for (int i = 0; i < 40; i++) {
            if(i%5 == 0)
                continueCycle = builder.addBusPassenger(new BusPassenger(passengerType.PRIVILEGED));
            else if(i%3==0)
                continueCycle = builder.addBusPassenger(new BusPassenger(passengerType.CHILD));
            else
                continueCycle = builder.addBusPassenger(new BusPassenger(passengerType.ADULT));

            if(!continueCycle) break;
        }

        builder.startTrip();

        builder.clear();

    }

    public void createTaxiTripWithSixPassengers(Builder builder){

        builder.setSeatsLimit();
        builder.setDriver(new Driver(licenceType.B));
        boolean continueCycle = true;

        for (int i = 0; i < 6; i++) {
            if(i%3==0)
                continueCycle = builder.addTaxiPassenger(new TaxiPassenger(true));
            else
                continueCycle = builder.addTaxiPassenger(new TaxiPassenger(false));
        }

        builder.startTrip();

        builder.clear();

    }

    public void createBusTripWithIncompetentDriver(Builder builder){

        builder.setSeatsLimit();
        builder.setDriver(new Driver(licenceType.A));
        boolean continueCycle = true;

        for (int i = 0; i < 20; i++) {
            if(i%5 == 0)
                continueCycle = builder.addBusPassenger(new BusPassenger(passengerType.PRIVILEGED));
            else if(i%3==0)
                continueCycle = builder.addBusPassenger(new BusPassenger(passengerType.CHILD));
            else
                continueCycle = builder.addBusPassenger(new BusPassenger(passengerType.ADULT));
        }

        builder.startTrip();

        builder.clear();

    }

    public void createBusTripWithNoPassengers(Builder builder){

        builder.setSeatsLimit();
        builder.setDriver(new Driver(licenceType.D));


        builder.startTrip();

        builder.clear();

    }




}
