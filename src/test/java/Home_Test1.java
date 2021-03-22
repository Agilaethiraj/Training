import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Home_Test1 {
WebDriver driver;
    @BeforeSuite
public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/agilaethiraj/Downloads/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://zoom.us/");
    }
    @Test
    public void testing1(){
        driver.navigate().to("https://explore.zoom.us/contactsales?_ga=2.122296904.275774255.1616285035-659157647.1616011722");
        WebElement btnSolutions = driver.findElement(By.id("btnSolutions"));
        System.out.println(btnSolutions.getTagName());
        System.out.println(btnSolutions.getAttribute("class"));
        btnSolutions.click();


    }
    @Test
    public void testing2(){
        driver.navigate().to("https://explore.zoom.us/contactsales");
        WebElement viewport = driver.findElement(By.name("viewport"));
        System.out.println(viewport.getTagName());
        System.out.println(viewport.isDisplayed());
        System.out.println(viewport.getLocation().x);
        System.out.println(viewport.getLocation().y);


    }
    @Test
    public void testing3(){
        driver.navigate().to("https://explore.zoom.us/contactsales");
        WebElement ul = driver.findElement(By.xpath("//a[@id=\"btnHostMeeting\"]"));
       ul.click();
        System.out.println(ul.getSize().height);
        System.out.println(ul.getSize().width);
        System.out.println(ul.isDisplayed());



    }
    @Test
    public void testing4(){
        driver.navigate().to("https://explore.zoom.us/contactsales");
       /* WebElement element = driver.findElement(By.cssSelector("#signupfree>.signupfree"));
        element.click();*/
        WebElement element1 = driver.findElement(By.cssSelector(".controls>#btnSubmit"));
        element1.submit();
        System.out.println(element1.getText());

    }
    @Test
    public void testing5() {
        driver.navigate().to("https://explore.zoom.us/contactsales");
        driver.findElement(By.linkText("SIGN IN")).click();
        driver.findElement(By.linkText("Request a Demo")).click();
        driver.findElement(By.linkText("Privacy Policy")).click();


    }
    @Test
    public void testing6(){
        driver.navigate().to("https://explore.zoom.us/contactsales");
//        driver.findElement(By.linkText("Learn about our Partner Programs."));
        driver.findElement(By.partialLinkText("IT'S FREE")).click();

    }
    @Test
    public void testing7(){
        driver.navigate().to("https://explore.zoom.us/contactsales");
        WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
        element.sendKeys("agila.sri21@gmail.com");

    }
    @Test
    public void testing8(){
        driver.navigate().to("https://explore.zoom.us/contactsales");
        WebElement element = driver.findElement(By.xpath("//div[@class='col-md-6']"));
        System.out.println(element.isDisplayed());
        System.out.println(element.getText());

    }
    @Test
    public void testing9() throws InterruptedException {
        driver.navigate().to("https://explore.zoom.us/contactsales");
       /* WebElement element = driver.findElement(By.xpath("//li[@class='signin']"));
        System.out.println(element.getText());*/
        /*WebElement element1 = driver.findElement(By.xpath("//li[@class='visible-xs divider']"));
        System.out.println(element1.getText());*/
       /* WebElement employee_count = driver.findElement(By.name("employee_count"));
        Select ss=new Select(employee_count);
        System.out.println(ss.isMultiple());
        ss.selectByIndex(1);
        Thread.sleep(5000);
      ss.selectByValue("1001-5000");
        Thread.sleep(5000);
        ss.selectByVisibleText("11-50");
       */
        WebElement state = driver.findElement(By.name("state"));
        Select ss2=new Select(state);
        /*ss2.selectByIndex(3);
        Thread.sleep(5000);
        ss2.selectByValue("AK");*/
        ss2.selectByIndex(2);
        System.out.println(ss2.getFirstSelectedOption().getText());


    }
    @Test
    public void testing10(){
        driver.navigate().to("https://zoom.us/pricing");
        WebElement element = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println(element.isEnabled());

    }
    @Test
    public void testing11() throws InterruptedException {
        driver.navigate().to("https://explore.zoom.us/contactsales");
        WebElement state = driver.findElement(By.id("state"));
        Select sel=new Select(state);
        sel.selectByIndex(4);
        Thread.sleep(5000);
        System.out.println(sel.getFirstSelectedOption().getText());
        Thread.sleep(5000);
        sel.selectByValue("GA");
        Thread.sleep(5000);
        sel.selectByVisibleText("Hawaii");
        Thread.sleep(5000);


    }
    @Test
    public void testing12(){
        driver.navigate().to("https://explore.zoom.us/contactsales");
        WebElement element = driver.findElement(By.xpath("//input[@id='city']"));
        element.sendKeys("Ontario");

    }
    @Test
    public void testing13() throws InterruptedException {
        driver.navigate().to("https://zoom.us/signin");
        WebElement element = driver.findElement(By.xpath("//input[@id='keep_me_signin']"));
        element.click();
        Thread.sleep(5000);
        driver.navigate().to("https://explore.zoom.us/contactsales?_ga=2.143406966.275774255.1616285035-659157647.1616011722");
        WebElement element1 = driver.findElement(By.className("img-responsive"));
        System.out.println(element1.getSize().height);
        System.out.println(element1.getSize().width);


    }
    @Test
    public void testing14() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/alerts");
        WebElement element = driver.findElement(By.xpath("//button[@id='alertButton']"));
        element.click();
        Thread.sleep(5000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        driver.navigate().to("https://demoqa.com/alerts");
        WebElement element1 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        element1.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(5000);
        alert.sendKeys("Agila");
      alert.accept();
        Thread.sleep(5000);
        WebElement element2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        element2.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();


    }
    @Test
    public void testing15(){
        driver.navigate().to("https://www.nike.com/ca/?cp=29728419214_search_%7Cnike%7C10628221437%7C106336396713%7Ce%7Cc%7CEN%7Cpure%7C452151650142&gclsrc=aw.ds&ds_rl=1252249&gclid=CjwKCAjwgOGCBhAlEiwA7FUXkr1qyaJ3SLi0lpGKTtgGv_r20m6w_Prge4QOhmdY6NDE-H5f0gn7hxoCxaAQAvD_BwE");
        WebElement iframe1 = driver.findElement(By.tagName("iframe"));
        System.out.println(iframe1.getSize());
        JavascriptExecutor driver = (JavascriptExecutor) this.driver;
        int i = Integer.parseInt(driver.executeScript("return window.length").toString());
        System.out.println(i);


    }
    @Test
    public void testing16(){
        driver.navigate().to("https://www.nike.com/ca/?cp=29728419214_search_%7Cnike%7C10628221437%7C106336396713%7Ce%7Cc%7CEN%7Cpure%7C452151650142&gclsrc=aw.ds&ds_rl=1252249&gclid=CjwKCAjwgOGCBhAlEiwA7FUXkr1qyaJ3SLi0lpGKTtgGv_r20m6w_Prge4QOhmdY6NDE-H5f0gn7hxoCxaAQAvD_BwE");
        driver.switchTo().frame("nike-unite-session");
    driver.switchTo().defaultContent().navigate().to("https://explore.zoom.us/contactsales");

    }
    @Test
    public void testing17() throws InterruptedException {
        driver.navigate().to("https://www.scotiabank.com/ca/en/personal.html");
        WebElement element = driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
        element.click();
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[2]/div/ul/li[2]/a"));
        element1.click();

    }
    @Test
    public void testing18() throws InterruptedException {
        driver.navigate().to("https://zoom.us/contactsales");

  Actions aq=new Actions(driver);
        Actions first_name = aq.moveToElement(driver.findElement(By.id("first_name")));
        first_name.doubleClick().build().perform();
        driver.navigate().to("https://support.zoom.us/hc/en-us?_ga=2.212981591.275774255.1616285035-659157647.1616011722");

        WebElement video_tutorials = driver.findElement(By.linkText("Show All"));
        video_tutorials.click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent().navigate().to("https://zoom.us/contactsales");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"btnHostMeeting\"]"));
        element.click();

    }
    @Test
    public void testing19(){
        driver.navigate().to("https://zoom.us/pricing");
        WebElement element = driver.findElement(By.xpath("//ul[@class='items-wrapper']/li[3]"));
        System.out.println(element.getText());

    }
    @AfterSuite
    public void close() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();


    }

}
