public abstract class Passenger {

    private String name;
    private String id;
    private Car reserved;
    private double trip_cost;

    //constructors
    public Passenger() {
    }
    public Passenger(String name, String id, Car reserved, double trip_cost) {
        this.name = name;
        this.id = id;
        this.reserved = reserved;
        this.trip_cost = trip_cost;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setReserved(Car reserved) {
        this.reserved = reserved;
    }
    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    //getters
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public Car getReserved() {
        return reserved;
    }
    public double getTrip_cost() {
        return trip_cost;
    }

    //methods
    public boolean discountUsed(){
        if (getTrip_cost()==new Route().getTrip_price())
            return false;
        else
            return true;
    }

   public abstract void reserveCar(Car car);


    public String display() {
        return "Passenger: \n" +
                "name= " + name +
                ", id= " + id +
//                ", reserved=" + reserved.display() +
                ", reserved=" + getReserved().getName() +
                ", trip_cost=" + trip_cost;
    }
}
