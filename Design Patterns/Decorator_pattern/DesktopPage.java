package Decorator_pattern;

class DesktopPage implements Page {
    
    public int getRank() {
        return 20; // Example rank for Desktop version
    }

    
    public String getDescription() {
        return "Desktop Page";
    }
}
