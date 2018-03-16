import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    @Test
    public void Main() {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://onetwotrip.com");
        String currentUrl = driver.getCurrentUrl();

        try {
            Assert.assertTrue("redirect has not happened", currentUrl.toString().startsWith("https://www.onetwotrip.com"));
            System.out.println("redirect has happened");
        }
        finally {
            driver.close();
        }
    }
}
