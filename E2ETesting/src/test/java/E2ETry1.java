import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class E2ETry1 {

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chrome/chromedriver.exe");

    }


    @Test
    public void VerifyThatUserCanGoToStep2Page() {
        String url = "https://insurancewebsitedemo.com/personal-insurance/car-insurance/";
        driver.get(url);
        String expectedTitle = "Auto, Car, Home Owners and Personal Insurance in Las Vegas Nevada - Demo Insurance Agency";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
