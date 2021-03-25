import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class Practice2 {
    WebDriver driver;


    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/agilaethiraj/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ca.hotels.com/?locale=en_CA&pos=HCOM_CA&rffrid=sem.hcom.CA.google.003.00.01.s.kwrd=c.397635851646.59117792781.1624180207..kwd-38751930.9000980..hotels%20com.CjwKCAjwxuuCBhATEiwAIIIz0QHhrzZf8vIrPxSNO9V70CZn8lpn6fkHoz1wrxszQhftCHOktL6lJBoCblgQAvD_BwE.aw.ds&PSRC=G21&gclid=CjwKCAjwxuuCBhATEiwA");

    }

    @Test
    public void set() throws InterruptedException {

        driver.navigate().to("https://ca.hotels.com/");
        WebElement element = driver.findElement(By.name("q-destination"));
        element.sendKeys("Niagara");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//tbody[@class='autosuggest-city']//tr[@id='citysqm-asi0-s1']")).click();
        driver.findElement(By.xpath("//label[@class='aria-label']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//td[@ data-date='2021-2-29']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[@data-input='qf-0q-localised-check-out']")).click();
        Thread.sleep(5000);

        String s = "March 2021";
        String s1 = "8";
        while (true) {
            String text = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[1]/div")).getText();
            if (text.equals(s)) {
                break;
            } else {
                driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div[1]/button[2]")).click();
            }


        }
        Thread.sleep(5000);

       /* WebElement element1 = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[1]/div[2]/table/tbody/tr[5]/td[2]/a"));
        element1.click();
        driver.findElement(By.xpath("//*[@id=\"hds-marquee\"]/div[2]/div/div/form/div[4]/button")).click();*/
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[8]/div[2]/div[2]/div[2]/table/tbody/tr/td/a"));
        for (WebElement web : elements) {
            String text = web.getText();
            if (text.equals(s1)) {
                web.click();
            }
        }
        driver.findElement(By.xpath("//*[@id=\"hds-marquee\"]/div[2]/div/div/form/div[4]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"listings\"]/ol/li[2]/article/section/aside/a")).click();
        Thread.sleep(5000);
        /*driver.navigate().to("https://ca.hotels.com/ho1158726528/?q-check-out=2021-04-08&FPQ=3&q-check-in=2021-03-29&WOE=4&WOD=1&q-room-0-children=0&pa=2&tab=description&JHR=8&q-room-0-adults=2&YGF=3&MGT=7&ZSX=0&SYE=3");
        Thread .sleep(5000);
       driver.findElement(By.xpath("//div[@class='fixed-footer-navigation-button-container']//a[@data-target='#rooms-and-rates-anchor']")).click();*/
        /*Thread.sleep(5000);
        driver.findElement(By.xpath(" //*[@id=\"rooms-and-rates.room-2-rateplan-1\"]/button ")).click();
*/
    }
    @Test
    public void se() throws InterruptedException {

        driver.navigate().to("https://ca.hotels.com/ho1158726528/?q-check-out=2021-04-08&FPQ=3&q-check-in=2021-03-29&WOE=4&WOD=1&q-room-0-children=0&pa=2&tab=description&JHR=8&q-room-0-adults=2&YGF=3&MGT=7&ZSX=0&SYE=3");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='button-container']//a[@id='book-now-button']")).click();
        Thread.sleep(5000);
       /* driver.findElement(By.xpath(" //*[@id=\"rooms-and-rates.room-2-rateplan-1\"]/button ")).click();*/
driver.findElement(By.xpath("//*[@id=\"rooms-and-rates.room-2-rateplan-1\"]/button")).click();
Thread.sleep(5000);


    }
    @AfterSuite
    public void end() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }







    }




