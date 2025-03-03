public class Car {

    private Route fixed_route;
    private int max_capacity;

    //constructors
    public Car() {
    }

    public Car(Route fixed_route, int max_capacity) {
        this.fixed_route = fixed_route;
        this.max_capacity = max_capacity;
    }

    //setters
    public void setFixed_route(Route fixed_route) {
        this.fixed_route = fixed_route;
    }
    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

    //getters
    public Route getFixed_route() {
        return fixed_route;
    }
    public int getMax_capacity() {
        return max_capacity;
    }

    //methods


}
