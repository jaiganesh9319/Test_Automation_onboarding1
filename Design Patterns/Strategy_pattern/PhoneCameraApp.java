package Strategy_pattern;

//Abstract PhoneCameraApp class
abstract class PhoneCameraApp {
 ShareBehavior shareBehavior; // Strategy for sharing

 public void takePhoto() {
     System.out.println("Taking a photo...");
 }

 public abstract void editPhoto(); // Each app variant will have its own editor

 public void savePhoto() {
     System.out.println("Saving the photo...");
 }

 // Delegate the sharing behavior to the strategy
 public void performShare() {
     if (shareBehavior != null) {
         shareBehavior.share();
     } else {
         System.out.println("No sharing method selected.");
     }
 }

 // Method to set the sharing behavior at runtime
 public void setShareBehavior(ShareBehavior shareBehavior) {
     this.shareBehavior = shareBehavior;
 }
}
