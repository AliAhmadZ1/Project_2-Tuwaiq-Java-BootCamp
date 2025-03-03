public class Route {

    private double trip_price;
    private String start_point;
    private String destination_point;

    //constructors
    public Route() {
    }

    public Route(double trip_price, String start_point, String destination_point) {
        this.trip_price = trip_price;
        this.start_point = start_point;
        this.destination_point = destination_point;
    }

    //setters
    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }

    public void setStart_point(String start_point) {
        this.start_point = start_point;
    }

    public void setDestination_point(String destination_point) {
        this.destination_point = destination_point;
    }

    //getters
    public double getTrip_price() {
        return trip_price;
    }

    public String getStart_point() {
        return start_point;
    }

    public String getDestination_point() {
        return destination_point;
    }

    //methods


}
