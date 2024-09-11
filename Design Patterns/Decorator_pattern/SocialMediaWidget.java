package Decorator_pattern;

class SocialMediaWidget extends PageDecorator {
    public SocialMediaWidget(Page decoratedPage) {
        super(decoratedPage);
    }

    
    public int getRank() {
        return super.getRank() + 4; // Rank increment for Social Media Widget
    }

    
    public String getDescription() {
        return super.getDescription() + ", Social Media Widget";
    }
}

