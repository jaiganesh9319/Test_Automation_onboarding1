package Factory_DesignPattern.Factory_DesignPattern;

public class BrowserFactory {

    public static Browser getBrowser(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                return new MyChromeDriver();
            case "firefox":
                return new MyFirefoxDriver();
            case "ie":
                return new MyIEDriver();
            default:
                throw new IllegalArgumentException("Unknown browser type");
        }
    }
}
