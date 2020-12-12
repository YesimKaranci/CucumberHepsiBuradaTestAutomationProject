package com.yesim.test.page;

import com.yesim.test.contracts.IDetailPage;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DetailPage extends BasePageUtil implements IDetailPage {

    public By degerlendirme=By.id("reviewsTabTrigger");
    public By thankyou = By.className("ReviewCard-module-1ZiTv");
    public By notComment=By.className("rating-information");

    public By yesButton = By.className("ReviewCard-module-1MoiF");
    List<WebElement> element = driver.findElements(yesButton);

    @Override
    public void clickCommentTab() {
        thread(8000);
        clickElement(degerlendirme);
        Assert.assertTrue("Yorumlar tabı görüntülenmedi!",isEnabled(degerlendirme));
    }

    @Override
    public void clickYesButton() {
        ((JavascriptExecutor)driver).executeScript("scroll(0,900)");
        thread(5000);
        clickElementOnList(yesButton,0);
        //Assert.assertTrue("Evet butonu görüntülenmedi",element.get(0).isDisplayed());
        //element.get(0).click();
    }

    @Override
    public void checkThankYou() {
        thread(3000);
        Assert.assertTrue("Teşekkür Ederiz görüntülenemedi",isEnabled(thankyou));
    }

    @Override
    public void clickNotCommentTab() {
        clickElement(notComment);
    }
}
