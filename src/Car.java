public class Car {

    private Route fixed_route;
    private int max_capacity;
    private String name;

    //constructors
    public Car() {
    }

    public Car(Route fixed_route, int max_capacity, String name) {
        this.fixed_route = fixed_route;
        this.max_capacity = max_capacity;
        this.name = name;
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
    public void setName(String name) {
        this.name = name;
    }

    //getters
    public Route getFixed_route() {
        return fixed_route;
    }
    public int getMax_capacity() {
        return max_capacity;
    }

    public String getName() {
        return name;
    }


//methods



    public String display() {
        return "Car{" + getName() +
                " has route=" + fixed_route.display() +
                ", max_capacity=" + max_capacity +
                '}';
    }
}
