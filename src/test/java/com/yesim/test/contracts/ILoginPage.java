package com.yesim.test.contracts;

public interface ILoginPage {

    void setEmail(String email);

    void setPassword(String password);

    void clickButtonLogin();

    void checkWarningMessage();

    void clickSuccessLoginButton();
}
