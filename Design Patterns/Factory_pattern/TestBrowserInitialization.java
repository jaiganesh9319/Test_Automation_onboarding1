package Factory_DesignPattern.Factory_DesignPattern;

public class TestBrowserInitialization {
    public static void main(String[] args) {
        Browser chromeBrowser = BrowserFactory.getBrowser("chrome");
        chromeBrowser.initialize();

        Browser firefoxBrowser = BrowserFactory.getBrowser("firefox");
        firefoxBrowser.initialize();
    }
}
