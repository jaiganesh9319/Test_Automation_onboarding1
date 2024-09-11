package Factory_DesignPattern.Factory_DesignPattern;

public class BrowserFactoryWithCapabilities {

    public static Browser getBrowser(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                return new MyChromeDriverWithCapabilities();
            case "firefox":
                return new MyFirefoxDriverWithCapabilities();
            case "ie":
                return new MyIEDriverWithCapabilities();
            default:
                throw new IllegalArgumentException("Unknown browser type");
        }
    }
}
