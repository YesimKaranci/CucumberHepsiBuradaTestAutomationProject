package com.yesim.test.tests;


import com.yesim.test.contracts.IHomePage;
import com.yesim.test.contracts.ILoginPage;
import com.yesim.test.page.HomePage;
import com.yesim.test.page.LoginPage;
import cucumber.api.java.en.And;

public class LoginTest {

    public ILoginPage loginPage = new LoginPage();
    public IHomePage homePage = new HomePage();

    @And("^Hepsi burada web sitesinde giriş yap butonuna tıklanır$")
    public void hepsiBuradaWebSitesindeGirişYapButonunaTıklanır() {
        homePage.clickLoginButton();
    }

    @And("^Açılan listeden giriş yap butonuna tıklanır$")
    public void açılanListedenGirişYapButonunaTıklanır() {
        homePage.clickSignInButton();
    }

    @And("^Giriş yap ekranında başarısız giriş için kullanıcı adı alanına ([^\"]*) yazılır$")
    public void girişYapEkranındaBaşarısızGirişIçinKullanıcıAdıAlanınaYazılır(String email) {
        loginPage.setEmail(email);
    }


    @And("^Giriş yap ekranında başarısız giriş için parola alanına ([^\"]*) yazılır$")
    public void girişYapEkranındaBaşarısızGirişIçinParolaAlanınaParolaYazılır(String password) {
        loginPage.setPassword(password);
    }

    @And("^Giriş yap ekranında girilen geçersiz bilgilerden sonra giriş butonuna tıklanır$")
    public void girişYapEkranındaGirilenGeçersizBilgilerdenSonraGirişButonunaTıklanır() {
        loginPage.clickButtonLogin();

    }

    @And("^E posta adresiniz ya da şifreniz yanlış uyarı mesajının geldiği kontrol edilir$")
    public void ePostaAdresinizYaDaŞifrenizYanlışUyarıMesajınınGeldiğiKontrolEdilir() {
        loginPage.checkWarningMessage();
    }

    @And("^Hepsi burada web sitesinde login butonuna tıklanır$")
    public void hepsiBuradaWebSitesindeLoginButonunaTıklanır() {
        homePage.clickLoginButton();
    }

    @And("^Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır$")
    public void hepsiBuradaWebSitesindeAçılanListedenGirişYapButonunaTıklanır() {
        homePage.clickSignInButton();
    }

    @And("^Giriş yap ekranında başarılı giriş için kullanıcı adı alanına ([^\"]*) yazılır$")
    public void girişYapEkranındaBaşarılıGirişIçinKullanıcıAdıAlanınaUsernameYazılır(String email) {
        loginPage.setEmail(email);

    }

    @And("^Giriş yap ekranında başarılı giriş için parola alanına ([^\"]*) yazılır$")
    public void girişYapEkranındaBaşarılıGirişIçinParolaAlanınaParolaYazılır(String password) {
        loginPage.setPassword(password);
    }

    @And("^Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır$")
    public void girişYapEkranındaGirilenGeçerliBilgilerdenSonraGirişButonunaTıklanır() {
        loginPage.clickSuccessLoginButton();
    }

    @And("^Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir$")
    public void başarılıGirişYapıldığınaDairAnasayfanınGeldiğiKontrolEdilir() {
        homePage.checkSuccessfulLogin();
    }

    @And("^Gelen ekranda swipe yaptırılır ve keşfet bulunur$")
    public void gelenEkrandaSwipeYaptırılırVeKeşfetBulunur() {
        homePage.homeSwipeUp();
    }

    @And("^Keşfet altında listelenenlerden kitapa tıklanır\\.$")
    public void keşfetAltındaListelenenlerdenKitapaTıklanır() {
        homePage.clickElementBook();
    }

    @And("^Gelen ekranda kitap,müzik,film,hobi kategorisi seçilir$")
    public void gelenEkrandaKitapMüzikFilmHobiKategorisiSeçilir() {
        homePage.clickCategory();
    }

    @And("^Kategorinin altındaki sekmelerden kitap ve dergi seçilir$")
    public void kategorininAltındakiSekmelerdenKitapVeDergiSeçilir() {
        homePage.clickBookSelection();
    }

}
