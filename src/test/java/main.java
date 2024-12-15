import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String sutUrl = "http://e.pl";
        driver.get(sutUrl);

        System.out.println("Otwarto strone");
        System.out.println("Adres tej strony to " + driver.getCurrentUrl());
        System.out.println("Tytul tej strony to " + driver.getTitle());
        //System.out.println("Zrodlo strony " + driver.getPageSource());

        WebElement zakladkaEmail = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[8]/nobr/a"));
        zakladkaEmail.click();

        WebElement zakladkaDomeny = driver.findElement((By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[12]/nobr/a/img")));
        zakladkaDomeny.click();

        WebElement zakladkaHosting = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[16]/nobr/a/img"));
        zakladkaHosting.click();

        WebElement stronaGlowna = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[4]/nobr/a/img"));
        stronaGlowna.click();


        driver.quit();

        System.out.println("Zamknieto przegladarke");
    }
}
