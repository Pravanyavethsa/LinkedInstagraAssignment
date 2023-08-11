package selinium.assignment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class LinkedInAss {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");

        driver.findElement(By.id("username")).sendKeys("testing");
        driver.findElement(By.name("session_password")).sendKeys("bridgelabz");

        //sign-in//
        driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
        Thread.sleep(1000);

        WebElement forgotpasslink = driver.findElement(By.linkText("Forgot password?"));
        forgotpasslink.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#username")).sendKeys("testing@123");
        Thread.sleep(1000);

        WebElement resetPasswd = driver.findElement(By.id("reset-password-submit-button"));
        resetPasswd.click();
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("Back")).click();
        Thread.sleep(1000);

        //continue with Google//
//        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/span[1]")).click();
//        driver.findElement(By.cssSelector("#container > div > div.nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb.oXtfBe-l4eHX > span.nsm7Bb-HzV7m-LgbsSe-BPrWId\n")).click();
//

        driver.findElement(By.partialLinkText("Join now")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("email-or-phone")).sendKeys("pravanya");

        driver.findElement(By.name("password")).sendKeys("bridgelabz");

        WebElement agreeAndJoin = driver.findElement(By.id("join-form-submit"));
        agreeAndJoin.click();
        Thread.sleep(1000);

        driver.findElement(By.partialLinkText("Sign in")).click();
        Thread.sleep(1000);

        TakesScreenshot src = (TakesScreenshot) driver;
        File srcShot2 = src.getScreenshotAs(OutputType.FILE);
        File destinationShot2 = new File("C:\\Users\\ADMIN\\IdeaProjects\\LocatorsDemo\\src\\main\\resources\\ThirdShot.png");
        FileHandler.copy(srcShot2, destinationShot2);



    }
}