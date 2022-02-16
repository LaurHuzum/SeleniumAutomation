import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Madalina/Desktop/chromedriver.exe");
        // la linea 3 i-am spus sistemului unde sa gaseasca driver-ul
        WebDriver driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.id("checkbox-1")).click();
    }

}

