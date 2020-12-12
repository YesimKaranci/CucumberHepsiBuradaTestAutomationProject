package com.yesim.test.util;

import com.yesim.test.tests.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePageUtil {

    public WebDriver driver = BaseTest.getDriver();

    public void clickElement(By element) {
        find(element).click();
    }

    public WebElement find(By element){
        //elementi 10 sn ara bulamazsan patlat
        WebDriverWait wait=new WebDriverWait(driver,10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void sendKeys(By element, String text) {
        find(element).sendKeys(text);
    }

    public boolean isElementDisplayed(By element) {
        return find(element).isDisplayed();
    }

    public String getText(By element) {
        return find(element).getText();
    }

    public boolean isEnabled(By element) {
       return  find(element).isEnabled();
    }

    public void swipeToElement(By by, int index) {

        List<WebElement> element = driver.findElements(by);
        /*
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        return element;*/

        Actions act = new Actions(driver);
        //act.moveToElement(element).click().build().perform();
        act.moveToElement(element.get(index)).perform();
    }

   public void clickElementOnList (By by, int index){
        //WebDriverWait wait=new WebDriverWait(driver,5);
        driver.findElements(by).get(index).click();
   }

   public void keyENTER(By by){
        driver.findElement(by).sendKeys(Keys.ENTER);
   }

    public void thread(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void scrollToElement(By element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}


