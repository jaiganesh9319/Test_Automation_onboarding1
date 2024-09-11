package Decorator_pattern;

//Decorator Class for Adding Widgets
abstract class PageDecorator implements Page {
 protected Page decoratedPage;

 public PageDecorator(Page decoratedPage) {
     this.decoratedPage = decoratedPage;
 }

 
 public int getRank() {
     return decoratedPage.getRank();
 }

 
 public String getDescription() {
     return decoratedPage.getDescription();
 }
}
