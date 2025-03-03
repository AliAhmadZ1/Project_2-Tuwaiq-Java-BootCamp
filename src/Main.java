import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static { //static block
        System.out.println("Project 2 Tuwaiq Java bootCamp");
        System.out.println("Ali Ahmed Alshehri");
        System.out.println("=====================================");
        Scanner input = new Scanner(System.in);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] route_points = {"A","B","C","D","G","P","S","W"};

        Route r1 = new Route(15,"A","C");
        Route r2 = new Route(24,"S","P");
        Route r3 = new Route(37,"B","G");

        Car c1 = new Car(r2,2);
        Car c2 = new Car(r1,6);
        Car c3 = new Car(r2,0);

        Passenger p1 = new Subscribers("Ali","111",c2,r1.getTrip_price());
        Passenger p2 = new Subscribers("Ahmed","112",c1,r2.getTrip_price());
        Passenger p3 = new Non_Subscribers("Omar","113",c3,34);
        Passenger p4 = new Non_Subscribers("Zaidan","coupon",c2,26);

        System.out.println(p1.getTrip_cost());
        Passenger[] p= {p1,p3};

        p1.reserveCar(c1);
        p2.reserveCar(c2);
        p4.reserveCar(c2);
        p3.reserveCar(c2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());







    }
}