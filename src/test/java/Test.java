import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/agilaethiraj/Downloads/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://ca.hotels.com/?locale=en_CA&pos=HCOM_CA&rffrid=sem.hcom.CA.google.003.00.01.s.kwrd=c.397635851646.59117792781.1624180207..kwd-38751930.9000980..hotels%20com.CjwKCAjwxuuCBhATEiwAIIIz0QHhrzZf8vIrPxSNO9V70CZn8lpn6fkHoz1wrxszQhftCHOktL6lJBoCblgQAvD_BwE.aw.ds&PSRC=G21&gclid=CjwKCAjwxuuCBhATEiwAIIIz0QHhrzZf8vIrPxSNO9V70CZn8lpn6fkHoz1wrxszQhftCHOktL6lJBoCblgQAvD_BwE&gclsrc=aw.ds");
        driver.findElement(By.xpath("//*[@id=\"widget-query-label-1\"]")).click();
        String s = "May 2021";
        String s1 = "28";
        List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[8]/div[2]/div[4]/div[2]/table/tbody/tr/td/a"));
        for(WebElement el: elements){
            System.out.println(el.getText());

        }
    }
}
