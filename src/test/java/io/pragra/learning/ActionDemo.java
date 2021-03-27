package io.pragra.learning;

import org.openqa.selenium.By;
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
        driver = new FirefoxDriver();
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

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
