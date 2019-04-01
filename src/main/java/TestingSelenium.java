import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class TestingSelenium {
    public static void main(String[] args) {
        ChromeDriver cdriver = new ChromeDriver();
        cdriver.get("https://www.ruv.de/home/");
        WebDriverWait wait = new WebDriverWait(cdriver, 15);
        WebElement produkte =wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Produkte"))));
        produkte.click();
        WebElement elektronikversicherung =wait.until(ExpectedConditions.elementToBeClickable((By.linkText("Elektronikversicherung"))));
        elektronikversicherung.click();
        WebElement handyversicherung =cdriver.findElement((By.cssSelector(".col-xs-24:nth-child(1) .teaser-image")));
        handyversicherung.click();
        WebElement auswahl =wait.until(ExpectedConditions.elementToBeClickable((By.cssSelector(".btn.btn-primaer"))));
        auswahl.click();
        System.out.println("Test erfolgreich beendet!");
    }
}
