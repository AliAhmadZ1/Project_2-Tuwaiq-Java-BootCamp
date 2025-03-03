public class Non_Subscribers extends Passenger {

    private boolean coupon;

    //constructors
    public Non_Subscribers() {
    }

    public Non_Subscribers(boolean coupon) {
        this.coupon = coupon;
    }

    public Non_Subscribers(String name, String id, Car reserved, double trip_cost) {
        super(name, id, reserved, trip_cost);
    }

    public Non_Subscribers(String name, String id, Car reserved, double trip_cost, boolean coupon) {
        super(name, id, reserved, trip_cost);
        this.coupon = coupon;
    }

    //getter - accessor
    public boolean isCoupon() {
        return coupon;
    }

    //setter - mutator
    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    //methods
    public boolean discountCoupon() {
        return coupon;
    }

    @Override
    public void reserveCar(Car car) {
        try {
            if (car.getMax_capacity() != 0) {
                super.setReserved(car);
                car.setMax_capacity(car.getMax_capacity() - 1);
                if (discountCoupon()) {
                    this.setTrip_cost(super.getTrip_cost() - (super.getTrip_cost() * 0.1));
                } else
                    this.setTrip_cost(super.getTrip_cost());
            } else
                throw new Exception();
        } catch (Exception e) {
            System.out.println("The car is max of passengers!!");
        }
    }

    @Override
    public String display() {
        return super.display() + " Non - Subscriber" + String.format(discountCoupon() ? " with a coupon discount 10%%" : "");
    }
}
