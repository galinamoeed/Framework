import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNew2 {
    WebDriver driver;

    @Test
    public void seleniumHQTittleTest(){
    String link = "https://www.selenium.dev/";
    driver.get(link);
    String actualTitle= "SeleniumHQ Browser Automation";
    String expectedTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);



        @Test
        public void VerifyGoogleSearch2() {
            String url = "https://mvnrepository.com/";
            driver.get(url);
            String expectedTitle = "Maven Repository: Search/Browse/Explore";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);



    }
}
