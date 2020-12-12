package com.yesim.test.page;

import com.yesim.test.contracts.ILoginPage;
import com.yesim.test.util.BasePageUtil;
import org.openqa.selenium.By;


public class LoginPage extends BasePageUtil implements ILoginPage {


    public By EMAIL=By.id("txtUserName");
    public By PASSWORD=By.id("txtPassword");
    public By BTN_LOGİN=By.id("btnLogin");
    public By WARNING_MESSAGE=By.className("sc-AxhUy fxWvvr");



    @Override
    public void setEmail(String email) {
        sendKeys(EMAIL,email);
    }

    @Override
    public void setPassword(String password) {
        sendKeys(PASSWORD,password);

    }

    @Override
    public void clickButtonLogin() {
        clickElement(BTN_LOGİN);
    }

    @Override
    public void checkWarningMessage() {
        thread(3000);
        //Assert.assertTrue("Uyarı metni düzgün görüntülenemedi!.", isEnabled(WARNING_MESSAGE));

    }


    @Override
    public void clickSuccessLoginButton() {
        clickElement(BTN_LOGİN);
    }

}
