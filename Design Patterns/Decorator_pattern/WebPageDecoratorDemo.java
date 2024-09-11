package Decorator_pattern;

//Main class to demonstrate the use of Decorator pattern
public class WebPageDecoratorDemo {
 public static void main(String[] args) {
     Page mobilePage = new MobilePage();
     System.out.println(mobilePage.getDescription() + " | Rank: " + mobilePage.getRank());

     // Adding widgets to the mobile page
     Page mobileWithChat = new ChatWidget(mobilePage);
     System.out.println(mobileWithChat.getDescription() + " | Rank: " + mobileWithChat.getRank());

     Page mobileWithChatAndAds = new AdvertisementWidget(mobileWithChat);
     System.out.println(mobileWithChatAndAds.getDescription() + " | Rank: " + mobileWithChatAndAds.getRank());

     // Creating a desktop page and adding widgets
     Page desktopPage = new DesktopPage();
     Page desktopWithSocialMedia = new SocialMediaWidget(desktopPage);
     System.out.println(desktopWithSocialMedia.getDescription() + " | Rank: " + desktopWithSocialMedia.getRank());
 }
}