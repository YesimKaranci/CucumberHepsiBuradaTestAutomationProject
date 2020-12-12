package com.yesim.test.page;

import com.yesim.test.contracts.ISearchPage;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePageUtil implements ISearchPage{

    public By search=By.id("SearchBoxOld");
    public By searchTxt=By.className("desktopOldAutosuggestTheme-input");
    public By searchButton=By.className("SearchBoxOld-buttonContainer");
    public By product=By.className("product-detail");
    public By addToCart=By.id("addToCart");
    public By searchListing=By.className("product-detail");
    public By searchArea = By.className("input free");
    public By filterText = By.className("filter-text");

    By scrollElement= By.className("product-detail");
    List<WebElement> myElements = driver.findElements(scrollElement);

    @Override
    public void checkSearchSection() {
        thread(5000);
        Assert.assertTrue("Arama alanı düzgün görüntülenemedi!",isEnabled(searchTxt));
        System.out.println("Arama alanı görüntülendi");
    }

    @Override
    public void productSearch(String product) {
        clickElement(searchTxt);
        sendKeys(searchTxt,product);
        clickElement(searchButton);
    }

    @Override
    public void searchSwipeUp() {
        thread(3000);
        swipeToElement(product,0);
    }

    @Override
    public void clickProduct() {
        thread(7000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
        clickElementOnList(searchListing,0);
    }

    @Override
    public void addProductToCart() {
        //swipeToElement(addToCart);
        clickElement(addToCart);
    }

    @Override
    public void swipeElement() {
        myElements.get(0).click();
    }

    @Override
    public void authorSearch(String product) {
        clickElementOnList(searchArea,0);
        sendKeys(searchArea,product);
        keyENTER(searchArea);
    }

    @Override
    public void clickSearchResult() {
        clickElement(filterText);
    }

    @Override
    public void clickNotCommentProduct() {
        Assert.assertTrue("Ürün görüntülenmedi!",isEnabled(product));
        clickElementOnList(product,1);
    }
}
