package com.cydeo.week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElementMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // find element
        // this method is using locator to locate web elements
        //
        //driver.get("https://www.google.com");


       //driver.findElement(By.xpath("//link[@href='/manifest?pwa=webhp']"));

        driver.get("https://practice.cydeo.com");
        WebElement dynamicLoading = driver.findElement(By.partialLinkText("Dynamic Con"));
        System.out.println("dynamicLoading = " + dynamicLoading.getText());

        // find element
        // this method is using locator to locate web elements
        // we have 8 types of locator
        //1. id
//        WebElement foot = driver.findElement(By.id("page-footer"));
//        System.out.println(foot.getText());
//        System.out.println(foot.getTagName());

        //2. link text
//        WebElement brokenLink = driver.findElement(By.linkText("Broken Images"));
//        System.out.println(brokenLink.getText());
//        brokenLink.click();

        // name
        WebElement meta = driver.findElement(By.name("viewport"));
        System.out.println("meta.getTagName() = " + meta.getTagName());


        // className
        WebElement h1 = driver.findElement(By.className("h1"));
        System.out.println("h1.getText() = " + h1.getText());

        WebElement secondTitle = driver.findElement(By.className("h2"));
        System.out.println("secondTitle.getText() = " + secondTitle.getText());

        // tagName

        WebElement tagName = driver.findElement(By.tagName("h1"));
        System.out.println("tagName.getText() = " + tagName.getTagName());

        WebElement abTesting = driver.findElement(By.xpath("//a[.='A/B Testing']"));

        System.out.println("abTesting.getText() = " + abTesting.getText());


    }
}
