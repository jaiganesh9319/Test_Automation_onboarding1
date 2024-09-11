package Builder_pattern;

//Main class to demonstrate the Builder pattern
public class BicycleBuilderDemo {
 public static void main(String[] args) {
     // Creating a bicycle with gears and a carrier
     Bicycle bicycle1 = new Bicycle.BicycleBuilder("Steel Frame", "Racing Handlebar")
             .setGears(true)
             .setCarrier(true)
             .build();

     System.out.println(bicycle1);

     // Creating a bicycle with double stands and double seats
     Bicycle bicycle2 = new Bicycle.BicycleBuilder("Aluminum Frame", "Mountain Handlebar")
             .setDoubleStand(true)
             .setDoubleSeats(true)
             .build();

     System.out.println(bicycle2);

     // Creating a basic bicycle with no extra fittings
     Bicycle bicycle3 = new Bicycle.BicycleBuilder("Carbon Frame", "Flat Handlebar")
             .build();

     System.out.println(bicycle3);
 }
}
