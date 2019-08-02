import org.openqa.selenium.WebDriver;

public class AdminMain {

    public static void main(String[] args) {

        WebDriver driver = DriverManager.getDriver("chrome");
        driver.navigate().to("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        driver.manage().window().maximize();

        driver.quit();
    }

}
