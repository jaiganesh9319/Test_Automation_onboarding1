package Builder_pattern;

//Bicycle class with optional features
class Bicycle {
 // Required parameters
 private final String frame;
 private final String handlebar;

 // Optional parameters
 private final boolean hasGears;
 private final boolean hasDoubleStand;
 private final boolean hasDoubleSeats;
 private final boolean hasCarrier;

 // Private constructor so objects can only be created via Builder
 private Bicycle(BicycleBuilder builder) {
     this.frame = builder.frame;
     this.handlebar = builder.handlebar;
     this.hasGears = builder.hasGears;
     this.hasDoubleStand = builder.hasDoubleStand;
     this.hasDoubleSeats = builder.hasDoubleSeats;
     this.hasCarrier = builder.hasCarrier;
 }

 // Getters for Bicycle attributes
 public String getFrame() {
     return frame;
 }

 public String getHandlebar() {
     return handlebar;
 }

 public boolean hasGears() {
     return hasGears;
 }

 public boolean hasDoubleStand() {
     return hasDoubleStand;
 }

 public boolean hasDoubleSeats() {
     return hasDoubleSeats;
 }

 public boolean hasCarrier() {
     return hasCarrier;
 }

 
 public String toString() {
     return "Bicycle [Frame: " + frame +
             ", Handlebar: " + handlebar +
             ", Gears: " + (hasGears ? "Yes" : "No") +
             ", Double Stand: " + (hasDoubleStand ? "Yes" : "No") +
             ", Double Seats: " + (hasDoubleSeats ? "Yes" : "No") +
             ", Carrier: " + (hasCarrier ? "Yes" : "No") + "]";
 }
 
//Static inner class for the Builder
 public static class BicycleBuilder {
     // Required parameters
     private final String frame;
     private final String handlebar;

     // Optional parameters initialized to default values
     private boolean hasGears = false;
     private boolean hasDoubleStand = false;
     private boolean hasDoubleSeats = false;
     private boolean hasCarrier = false;

     // Constructor with required parameters
     public BicycleBuilder(String frame, String handlebar) {
         this.frame = frame;
         this.handlebar = handlebar;
     }

     // Methods to set optional features
     public BicycleBuilder setGears(boolean hasGears) {
         this.hasGears = hasGears;
         return this;
     }

     public BicycleBuilder setDoubleStand(boolean hasDoubleStand) {
         this.hasDoubleStand = hasDoubleStand;
         return this;
     }

     public BicycleBuilder setDoubleSeats(boolean hasDoubleSeats) {
         this.hasDoubleSeats = hasDoubleSeats;
         return this;
     }

     public BicycleBuilder setCarrier(boolean hasCarrier) {
         this.hasCarrier = hasCarrier;
         return this;
     }

     // Build method to create the final Bicycle object
     public Bicycle build() {
         return new Bicycle(this);
     }
 }
}


