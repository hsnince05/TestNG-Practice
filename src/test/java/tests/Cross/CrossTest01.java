package tests.Cross;

import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class CrossTest01 extends TestBaseCross {

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Deneme Test");
        driver.get("https://amazon.com");
        extentTest.info("Amazon'a gidildi.");

        driver.get("https://facebook.com");
        extentTest.info("Facebook'a gidildi.");

        extentTest.pass("Test Passed");
    }
}
