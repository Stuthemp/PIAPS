package tirps;

import drivers.Driver;
import drivers.licenceType;
import passengers.BusPassenger;

import java.util.List;

public class BusTrip {

    private Driver driver;
    private final int seatsLimit;
    private List<BusPassenger> busPassengers;


    public BusTrip(Driver driver, int seatsLimit, List<BusPassenger> busPassengers){

        this.driver = driver;
        this.seatsLimit = seatsLimit;
        this.busPassengers =busPassengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getSeatsLimit() {
        return seatsLimit;
    }

    public List<BusPassenger> getBusPassengers() {
        return busPassengers;
    }

    public void setBusPassengers(List<BusPassenger> busPassengers) {
        this.busPassengers = busPassengers;
    }
}
