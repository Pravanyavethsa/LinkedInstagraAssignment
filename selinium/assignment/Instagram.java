package selinium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Instagram {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com");
        Thread.sleep(1000);

        //Username// valid credentials//
        driver.findElement(By.name("username")).sendKeys("testingtestdata");
        Thread.sleep(1000);
        //password//
        driver.findElement(By.name("password")).sendKeys("testingtestdatablz");
        Thread.sleep(1000);

        //login//
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Not Now\"]")));
        driver.findElement(By.xpath("//button[text()=\"Not Now\"]")).click();


        //more//
        driver.findElement(By.xpath("//span[text()='More']")).click();
        Thread.sleep(1000);

        //logout//
        driver.findElement(By.xpath("//span[text()='Log out']")).click();
        Thread.sleep(1000);

//        //forgot pswd// Invalid credentials//
//        WebElement forgotPassLink = driver.findElement(By.linkText("Forgot password?"));
//        forgotPassLink.click();
//        Thread.sleep(1000);
//
//        //Username or phn num or mail//
//        driver.findElement(By.name("cppEmailOrUsername")).sendKeys("pravanya");
//        Thread.sleep(1000);

//        //send login link//
//        driver.findElement(By.xpath("//div[text()='Send login link']")).click();
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//div[text()='presentation']")).click();
//        Thread.sleep(1000);

//        // cant reset pswd//
//        driver.findElement(By.linkText("Can't reset your password?")).click();
//       Thread.sleep(3000);
//
//        driver.navigate().back();
//        driver.navigate().to("https://www.instagram.com/");

//        //create new account//
//        driver.findElement(By.linkText("Create New Account")).click();
//        Thread.sleep(1000);


//
//         //sign up//
//        driver.findElement(By.xpath("//class[text()='Sign up']")).click();
//        Thread.sleep(500);
//
//        //Back to login page//
////        driver.findElement(By.partialLinkText("Back to Login")).click();
////        Thread.sleep(1000);
////        driver.findElement(By.cssSelector("#mount_0_0_3A > div > div > div.x9f619.x1n2onr6.x1ja2u2z > div > div > div > div.x78zum5.xdt5ytf.x1t2pt76.x1n2onr6.x1ja2u2z.x10cihs4 > section > main > div._ac06.x78zum5.xdt5ytf > div > div > div > div > div.x9f619.xjbqb8w.x78zum5.x168nmei.x13lgxp2.x5pf9jr.xo71vjh.xxqbpr.x1uhb9sk.x1ey2m1c.x17qophe.xds687c.x1plvlek.xryxfnj.x1c4vz4f.x2lah0s.xdt5ytf.xqjyukv.x1qjc9v5.x1oa3qoh.x1nhvcw1 > div > a")).click();
////        Thread.sleep(1000);
//
//
//
//
////         driver.findElement(By.name("emailOrPhone")).sendKeys("Pravanya");
//
//
//
//
//
////        driver.findElement(By.linkText("Back to Login")).click();
////        Thread.sleep(1000);
//
////        WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
////        loginbutton.click();
////        Thread.sleep(1000);
//
//
////        driver.close();

    }
}
