//package builders;
//
//import drivers.Driver;
//import drivers.licenceType;
//import passengers.BusPassenger;
//import passengers.TaxiPassenger;
//import tirps.BusTrip;
//import tirps.TaxiTrip;
//import tirps.Trip;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TripBuilder implements Builder {
//
//    private Driver driver;
//    private int seatsLimit;
//    private List<BusPassenger> busPassengers = new ArrayList<>();
//    private List<TaxiPassenger> taxiPassengers = new ArrayList<>();
//    private boolean hasChildSeat = false;
//    public int income = 0;
//
//
//    @Override
//    public void setSeatsLimit() {
//        this.seatsLimit = 0;
//    }
//
//    @Override
//    public void setDriver(Driver driver) {
//        this.driver = driver;
//    }
//
//    @Override
//    public boolean addBusPassenger(BusPassenger passenger) {
//        if(busPassengers.size() >= seatsLimit) {
//            System.out.println("Места закончились");
//            return false;
//        }
//        else {
//            switch (passenger.pt) {
//                case PRIVILEGED -> {
//                    this.busPassengers.add(passenger);
//                }
//                case CHILD -> {
//                    income =+25;
//                    this.busPassengers.add(passenger);
//                }
//                case ADULT -> {
//                    income += 50;
//                    this.busPassengers.add(passenger);
//                }
//            }
//            return true;
//        }
//    }
//
//    @Override
//    public boolean addTaxiPassenger(TaxiPassenger passenger) {
//        if(taxiPassengers.size() >= seatsLimit)
//            System.out.println("Места закончились");
//        else {
//            if(passenger.isChild){
//                addChildSeat();
//            }
//        }
//        this.taxiPassengers.add(passenger);
//    }
//
//    @Override
//    public void addChildSeat() {
//        this.hasChildSeat = true;
//    }
//
//    @Override
//    public void startTrip() {
//        if(driver == null){
//            System.out.println("Поездка не начнется без водителя");
//        }
//        else if((driver.lt.equals(licenceType.D) && busPassengers.size() == 0) || (driver.lt.equals(licenceType.B) && taxiPassengers.size() == 0) ){
//            System.out.println("Поездка не начнется без пассажиров.");
//        }
//        else {
//            System.out.println("Поездка началась, общий доход: " + income);
//        }
//    }
//
//    public BusTrip getResult(){
//        BusTrip bp = new BusTrip(driver,seatsLimit,busPassengers);
//        return bp;
//    }
//
//}
