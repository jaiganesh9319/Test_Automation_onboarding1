package Strategy_pattern;

//Concrete strategy for sharing via Social Media
class ShareBySocialMedia implements ShareBehavior {
 
 public void share() {
     System.out.println("Sharing photo via Social Media...");
 }
}
