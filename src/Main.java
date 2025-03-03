import java.util.Scanner;

public class Main {
    static { //static block
        System.out.println("Project 2 Tuwaiq Java bootCamp");
        System.out.println("Ali Ahmed Alshehri");
        System.out.println("=====================================");
        Scanner input = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //routes address
        String[] route_points = {"A", "B", "C", "D", "G", "P", "S", "W"};

        //route objects
        Route r1 = new Route(15, "A", "C");
        Route r2 = new Route(24, "S", "P");
        Route r3 = new Route(37, "B", "G");

        //car objects
        Car c1 = new Car(r2, 2,"Camry");
        Car c2 = new Car(r1, 6,"Corolla");
        Car c3 = new Car(r2, 0,"Audi");

        //passenger objects
        Passenger p1 = new Subscribers("Ali", "111", c2, r2.getTrip_price());
        Passenger p2 = new Subscribers("Ahmed", "112", c1, r2.getTrip_price());
        Passenger p3 = new Non_Subscribers("Omar", "113", c3, r2.getTrip_price(),true);
        Passenger p4 = new Non_Subscribers("Zaidan", "coupon", c2, r1.getTrip_price(),false);
        Passenger p5 = new Non_Subscribers("asdff", "155", c3, r2.getTrip_price(),true);

        //reserved car
        p1.reserveCar(c1);
        p2.reserveCar(c2);
        p4.reserveCar(c2);
        p3.reserveCar(c2);
        p5.reserveCar(c3);

        //print details
        System.out.println(p1.display()+"\n-------------------------------------");
        System.out.println(p2.display()+"\n-------------------------------------");
        System.out.println(p3.display()+"\n-------------------------------------");
        System.out.println(p4.display()+"\n-------------------------------------");
        System.out.println(p5.display()+"\n-------------------------------------");

    }
}