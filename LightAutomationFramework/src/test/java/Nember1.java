import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    @VisibleForTesting
    public void VerifyGoogleSearch(){
        WebDriver driver = new ChromeDriver();
        String url="https://mvnrepository.com/";
        driver.get(url);

    }
}
