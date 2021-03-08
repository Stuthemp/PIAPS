package tirps;

import drivers.Driver;
import drivers.licenceType;
import passengers.BusPassenger;
import passengers.TaxiPassenger;

import java.util.List;

public class TaxiTrip {

    private  Driver driver;
    private final int seatsLimit;
    private List<TaxiPassenger> taxiPassengers;
    int price;

    public TaxiTrip(Driver driver, int seatsLimit, List<TaxiPassenger> taxiPassengers, int price){

        this.driver = driver;
        this.seatsLimit = seatsLimit;
        this.taxiPassengers =taxiPassengers;
        this.price = price;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getSeatsLimit() {
        return seatsLimit;
    }

    public List<TaxiPassenger> getTaxiPassengers() {
        return taxiPassengers;
    }

    public void setTaxiPassengers(List<TaxiPassenger> taxiPassengers) {
        this.taxiPassengers = taxiPassengers;
    }

}
