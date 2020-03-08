package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {


    public static WebDriver getDriver(String str) {
        if (str.equalsIgnoreCase("edge")) {
            return null;
        } else if(str.equalsIgnoreCase("Safari")){
            WebDriverManager.chromedriver().version("79.0").setup();
            return new SafariDriver();
        }else {
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();
        }

    }
}