package tirps;

import drivers.Driver;
import passengers.BusPassenger;
import passengers.TaxiPassenger;

import java.util.List;

public class Trip {

    List<BusPassenger> busPassengers;
    List<TaxiPassenger> taxiPassengers;
    Driver  driver;
    boolean childSeat;

    public List<BusPassenger> getBusPassengers() {
        return busPassengers;
    }

    public void setBusPassengers(List<BusPassenger> busPassengers) {
        this.busPassengers = busPassengers;
    }

    public List<TaxiPassenger> getTaxiPassengers() {
        return taxiPassengers;
    }

    public void setTaxiPassengers(List<TaxiPassenger> taxiPassengers) {
        this.taxiPassengers = taxiPassengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public boolean isChildSeat() {
        return childSeat;
    }

    public void setChildSeat(boolean childSeat) {
        this.childSeat = childSeat;
    }
}
