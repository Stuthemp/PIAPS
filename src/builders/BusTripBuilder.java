package builders;

import drivers.Driver;
import drivers.licenceType;
import passengers.BusPassenger;
import passengers.TaxiPassenger;
import tirps.BusTrip;

import java.util.ArrayList;
import java.util.List;

public class BusTripBuilder implements Builder {

    private Driver driver = new Driver(licenceType.FAKE);
    private int seatsLimit;
    private List<BusPassenger> busPassengers = new ArrayList<>();
    private List<TaxiPassenger> taxiPassengers = new ArrayList<>();
    private boolean hasChildSeat = false;
    public int income = 0;


    @Override
    public void setSeatsLimit() {
        this.seatsLimit = 30;
    }

    @Override
    public void setDriver(Driver driver) {
        if(driver.lt.equals(licenceType.D))
            this.driver = driver;
        else
            System.out.println("Водитель не имеет нужной компетенции");
    }

    @Override
    public boolean addBusPassenger(BusPassenger passenger) {
        if(busPassengers.size() >= seatsLimit) {
            System.out.println("Места закончились");
            return false;
        }

        else {
            switch (passenger.pt) {
                case PRIVILEGED -> {
                    this.busPassengers.add(passenger);
                }
                case CHILD -> {
                    income =+25;
                    this.busPassengers.add(passenger);
                }
                case ADULT -> {
                    income += 50;
                    this.busPassengers.add(passenger);
                }
            }
            return true;
        }
    }

    @Override
    public boolean addTaxiPassenger(TaxiPassenger passenger) {
        if(taxiPassengers.size() >= seatsLimit) {
            System.out.println("Места закончились");
            return false;
        } else {
            if(passenger.isChild){
                addChildSeat();
                this.taxiPassengers.add(passenger);
            }
            else {
                taxiPassengers.add(passenger);
            }
            return true;
        }
    }

    @Override
    public void addChildSeat() {
        this.hasChildSeat = true;
    }

    @Override
    public void startTrip() {
        if(driver.lt.equals(licenceType.FAKE)){
            System.out.println("Поездка не начнется без водителя");
        }
        else if((driver.lt.equals(licenceType.D) && busPassengers.size() == 0) || (driver.lt.equals(licenceType.B) && taxiPassengers.size() == 0) ){
            System.out.println("Поездка не начнется без пассажиров.");
        }
        else {
            System.out.println("Поездка началась, общий доход: " + income);
        }
    }

    public BusTrip getResult(){
        BusTrip bp = new BusTrip(driver,seatsLimit,busPassengers);
        return bp;
    }

    @Override
    public void clear(){
        driver = new Driver(licenceType.FAKE);
        busPassengers.clear();
        taxiPassengers.clear();
        income  = 0;
        hasChildSeat = false;
        seatsLimit = 0;
    }

}
