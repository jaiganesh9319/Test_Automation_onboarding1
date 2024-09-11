package Strategy_pattern;

//Concrete strategy for sharing via Email
class ShareByEmail implements ShareBehavior {
 
 public void share() {
     System.out.println("Sharing photo via Email...");
 }
}
