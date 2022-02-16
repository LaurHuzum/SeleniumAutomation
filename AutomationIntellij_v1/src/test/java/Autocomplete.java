import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Madalina/Desktop/chromedriver.exe");
        // la linea 3 i-am spus sistemului unde sa gaseasca driver-ul
        WebDriver driver= new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete= driver.findElement(By.id("autocomplete"));//aici identificam prin intermediuo id-ului elementul textbox
                                                                           //elementul identificat este salvat intr o varianta care este numit autocomplete care are tipul de date web element

        autocomplete.sendKeys("Strada nr.5");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/[td2]/button")).click();
        //Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
        /* O variabila este o adresa de memorie la care sunt stocate informatii
        O functie reprezinta un set de instructiuni grupate sub un singur nume
        O clasa reprezinta un tipar care definseste atributele pe care trebuie sa le aiba un obiect si actiunile pe care trebuie sa le faca
        Un obiect este o instanta a unei clase, adica o reprezentare reala creata pe baza tiparului definit in clasa
        Un tip de data este o proprietate a unei variabile sau functii care specifica ce informatii pot fi stocate in variabila sau returnata de catre functie
        Putem spune ca o fnctie returneaza ceva atunci cand trimite rezultatul actiunii pe care o face catre exterior
         */

    }
}
