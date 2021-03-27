package io.pragra.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionDemo {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","/Users/atinsingh/Downloads/geckodriver");
        System.setProperty("webdriver.chrome.driver","/Users/atinsingh/Downloads/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    void tc() {
        driver.get("https://www.cn.ca");

        //ctl06__f41395630c931d_repMainNav_topLevelLink_1
        WebElement services = driver.findElement(By.id("ctl06__f41395630c931d_repMainNav_topLevelLink_1"));
        WebElement maps = driver.findElement(By.id("ctl06__f41395630c931d_repMainNav_repSecondLevel_1_secondLevelLink_5"));
        WebElement destination = driver.findElement(By.id("ctl06__f41395630c931d_repMainNav_repSecondLevel_1_repThirdLevel_5_thirdLevelLink_2"));
        WebElement asia = driver.findElement(By.id("ctl06__f41395630c931d_repMainNav_repSecondLevel_1_repThirdLevel_5_repFourthLevel_2_fourthLevelLink_0"));

        Actions actions = new Actions(driver);

        actions.moveToElement(services)
                .pause(1000)
                .moveToElement(maps)
                .pause(1000)
                .moveToElement(destination)
                .pause(1000)
                .moveToElement(asia)
                .pause(1000)
                .click()
                .build()
                .perform();

        driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");
        WebElement frame_examples = driver.findElement(By.id("frame_Examples"));
        driver.switchTo().frame(frame_examples);

        WebElement aside = driver.findElement(By.tagName("aside"));

        actions.moveToElement(aside).pause(4000).doubleClick().build().perform();

        driver.switchTo().parentFrame();

        WebElement result = driver.findElement(By.id("result"));
        result.click();

        driver.navigate().to("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement dragable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(dragable, droppable).build().perform();


        driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

        driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
        WebElement op1 = driver.findElement(By.xpath("//*[@id='cars']/option[1]"));
        WebElement op2= driver.findElement(By.xpath("//*[@id='cars']/option[2]"));
        WebElement op4= driver.findElement(By.xpath("//*[@id='cars']/option[4]"));

        actions.keyDown(Keys.COMMAND)
                .pause(1000)
                .click(op1)
                .pause(1000)
                .click(op2)
                .pause(1000)
                .click(op4)
                .build()
                .perform();

        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        ////div[@role='main']/p/span
        WebElement element = driver.findElement(By.xpath("//div[@role='main']/p/span"));
        //ul[@class='context-menu-list context-menu-root']/li[7]
      WebElement close=  driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[7]"));
        actions.moveToElement(element)
                .contextClick()
                .pause(1000)
                .moveToElement(close)
                .pause(2000)
                .click()
                .build()
                .perform();

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
