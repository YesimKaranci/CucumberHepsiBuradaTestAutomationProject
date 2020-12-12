package com.yesim.test.tests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {

    protected static WebDriver driver;
    private final String driverName = "webdriver.gecko.driver";
    private final String driverPath = "C:\\Users\\91098874\\Desktop\\geckodriver.exe";
    private final String url = "https://www.hepsiburada.com/";

    public static WebDriver getDriver() { return driver; }

    @Before
    public void setup(){
        System.setProperty(driverName,driverPath);
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    @After
    public void close(){
        //driver.quit(); //tarayıcıyı kapat
    }

}
