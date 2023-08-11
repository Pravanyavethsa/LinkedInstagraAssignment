package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


        driver.findElement(By.id("email")).sendKeys("testing");
        driver.findElement(By.name("pass")).sendKeys("bridgelabz");

        WebElement forgotPassLink = driver.findElement(By.linkText("Forgotten password?"));
        forgotPassLink.click();

        driver.findElement(By.partialLinkText("Cancel")).click();
        Thread.sleep(1000);

//     driver.findElement(By.cssSelector("#u_0_0_Tj")).click();
        WebElement loginbutton=driver.findElement(By.id("loginbutton"));
        loginbutton.click();
        Thread.sleep(1000);

        WebElement forgotpasslink1=driver.findElement(By.linkText("Forgotten password?"));
        forgotpasslink1.click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#identify_email")).sendKeys("testing@123");
        Thread.sleep(1000);
//         driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("testing");
//       driver.findElement(By.xpath("//*[@id=\"u_1d_b_IF\"]")).sendKeys("bridge labz");
       driver.close();
    }

}
