package com.cydeo.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("123142wr15ong@email.com");

        WebElement passwordInput = driver.findElement(By.id("pass"));

        passwordInput.sendKeys("wrongPassword" + Keys.ENTER);


        String expectedTitle = "Log in to Facebook";

        Thread.sleep(5000);

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!!!");
        }











    }

}
