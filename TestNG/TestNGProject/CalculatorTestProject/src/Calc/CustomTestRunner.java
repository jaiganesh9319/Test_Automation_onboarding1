package Calc;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomTestRunner {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        
        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./testng.xml")); 
        
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        
        testNG.setXmlSuites(suites);
        testNG.addListener(new ExtentReportListener());  // Add ExtentReportListener
        
        
        testNG.run();
    }
}
