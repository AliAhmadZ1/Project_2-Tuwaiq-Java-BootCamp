public class Subscribers extends Passenger{


    //constructors
    public Subscribers() {
    }
    public Subscribers(String name, String id, Car reserved, double trip_cost) {
        super(name, id, reserved, trip_cost);
    }


    @Override
    public void reserveCar(Car car){
        try {
            if (car.getMax_capacity() != 0) {
                super.setReserved(car);
                car.setMax_capacity(car.getMax_capacity() - 1);
                this.setTrip_cost(super.getTrip_cost() / 2);
            } else
                throw new Exception();
        }catch (Exception e){
            System.out.println("the capacity is full.");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ " Subscriber";
    }


}
