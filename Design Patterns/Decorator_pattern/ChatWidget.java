package Decorator_pattern;

//Concrete Widgets
class ChatWidget extends PageDecorator {
 public ChatWidget(Page decoratedPage) {
     super(decoratedPage);
 }

 
 public int getRank() {
     return super.getRank() + 5; // Rank increment for Chat Widget
 }

 
 public String getDescription() {
     return super.getDescription() + ", Chat Widget";
 }
}


