package Factory_DesignPattern.Factory_DesignPattern;

public class TestBrowserWithCapabilities {
    public static void main(String[] args) {
        Browser chromeWithCapabilities = BrowserFactoryWithCapabilities.getBrowser("chrome");
        chromeWithCapabilities.initialize();

        Browser firefoxWithCapabilities = BrowserFactoryWithCapabilities.getBrowser("firefox");
        firefoxWithCapabilities.initialize();
    }
}
