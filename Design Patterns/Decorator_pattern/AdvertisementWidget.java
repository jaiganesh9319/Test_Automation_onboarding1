package Decorator_pattern;

class AdvertisementWidget extends PageDecorator {
    public AdvertisementWidget(Page decoratedPage) {
        super(decoratedPage);
    }

    
    public int getRank() {
        return super.getRank() + 3; // Rank increment for Advertisement Widget
    }

    
    public String getDescription() {
        return super.getDescription() + ", Advertisement Widget";
    }
}
