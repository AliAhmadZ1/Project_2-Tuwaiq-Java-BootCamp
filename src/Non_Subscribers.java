public class Non_Subscribers extends Passenger {

    public boolean discountCoupon() {
        return this.getId().equals("coupon");
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
            System.out.println("the capacity is full.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Non - Subscriber";
    }
}
