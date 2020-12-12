package com.yesim.test.tests;

import com.yesim.test.contracts.IDetailPage;
import com.yesim.test.page.DetailPage;
import cucumber.api.java.en.And;

public class DetailTest {

    public IDetailPage detailPage = new DetailPage();

    @And("^Ürün detayında Yorumlar tabına gidilir$")
    public void ürünDetayındaYorumlarTabınaGidilir() {
        detailPage.clickCommentTab();
    }

    @And("^Yorumlar içinden ilk yorumun Evet butonuna basılır$")
    public void yorumlarIçindenIlkYorumunEvetButonunaBasılır() {
        detailPage.clickYesButton();

    }

    @And("^Kullanıcı Teşekkür ederiz yazısını görür$")
    public void kullanıcıTeşekkürEderizYazısınıGörür() {
        detailPage.checkThankYou();
    }

    @And("^Yorumu olmayan ürün detayında Yorumlar tabına gidilir$")
    public void yorumuOlmayanÜrünDetayındaYorumlarTabınaGidilir() {
        detailPage.clickNotCommentTab();
    }
}
