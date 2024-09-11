package Strategy_pattern;

//Concrete strategy for sharing via Text
class ShareByText implements ShareBehavior {
 
 public void share() {
     System.out.println("Sharing photo via Text...");
 }
}
