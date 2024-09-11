package Decorator_pattern;

//Concrete Implementation of a Page (e.g., Mobile or Desktop)
class MobilePage implements Page {
 
 public int getRank() {
     return 10; // Example rank for Mobile version
 }
 
 
 public String getDescription() {
     return "Mobile Page";
 }
}