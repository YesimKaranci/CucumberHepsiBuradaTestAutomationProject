package com.yesim.test.page;

import com.yesim.test.contracts.IHomePage;
import com.yesim.test.contracts.ILoginPage;
import com.yesim.test.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends BasePageUtil implements IHomePage {

    public By loginButton = By.id("myAccount");
    public By signInButton = By.id("login");
    public By kesfet = By.className("trending-title");
    public By kitap = By.className("trending-items-title");
    public By MYACCOUNT=By.id("myAccount");
    public By category= By.id("kitap-muzik-film-hobi");
    public By kitapvedergi = By.className("menu-item");

    @Override
    public ILoginPage clickLoginButton() {
        clickElement(loginButton);
        return new LoginPage();
    }

    @Override
    public void clickSignInButton() {
        clickElement(signInButton);
    }

    @Override
    public void checkSuccessfulLogin() {
        Assert.assertTrue("Anasayfa düzgün görüntülenemedi",isEnabled(MYACCOUNT));
    }


    @Override
    public void homeSwipeUp() {
        swipeToElement(kesfet,0);
        clickElement(kesfet);
    }

    @Override
    public void clickElementBook() {
        swipeToElement(kitap,0);
        clickElementOnList(kitap, 8);

    }

    @Override
    public void clickCategory() {
        clickElement(category);
    }

    @Override
    public void clickBookSelection() {
        Assert.assertTrue("Kitap-Dergi kategorisi görüntülenmedi!",isEnabled(kitapvedergi));
        clickElementOnList(kitapvedergi,1);
    }


}
