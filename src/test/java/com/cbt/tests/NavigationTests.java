package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        StringUtility.verifyEquals("Google",title);



    }


}
