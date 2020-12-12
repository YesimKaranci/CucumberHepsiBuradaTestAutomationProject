package com.yesim.test.tests;

import com.yesim.test.contracts.ISearchPage;
import com.yesim.test.page.SearchPage;
import cucumber.api.java.en.And;

public class SearchTest {
    public ISearchPage searchPage=new SearchPage();

    @And("^Giriş yaptıktan sonra arama bölümünün geldiği kontrol edilir$")
    public void girişYaptıktanSonraAramaBölümününGeldiğiKontrolEdilir() {
        searchPage.checkSearchSection();
    }


    @And("^Ürün ismi yazılarak arama butonuna tıklanır ve arama alanına ([^\"]*) yazılır$")
    public void ürünIsmiYazılarakAramaButonunaTıklanırVeAramaAlanınaProductYazılır(String product) {
        searchPage.productSearch(product);
    }

    @And("^Arama sonucunda çıkan ürünler sayfasında swipe yapılır$")
    public void aramaSonucundaÇıkanÜrünlerSayfasındaSwipeYapılır() {
        searchPage.searchSwipeUp();
    }

    @And("^Listelenen seçenekler arasından istenilen ürüne tıklanır$")
    public void listelenenSeçeneklerArasındanIstenilenÜrüneTıklanır() {
        searchPage.clickProduct();
    }

    @And("^Ürün sepete eklenir$")
    public void ürünSepeteEklenir() {
        searchPage.addProductToCart();
    }

    @And("^Açılan kitap kategorisi sayfasında swipe yaptırılır$")
    public void açılanKitapKategorisiSayfasındaSwipeYaptırılır() {
        searchPage.swipeElement();
    }

    @And("^Yazar bölümünde arama alanına ([^\"]*) yazılır$")
    public void yazarBölümündeAramaAlanınaProductYazılır(String product) {
        searchPage.authorSearch(product);
    }

    @And("^Arama sonucu listelenen ürüne tıklanır$")
    public void aramaSonucuListelenenÜrüneTıklanır() {
        searchPage.clickSearchResult();

    }

    @And("^Listelenen seçenekler arasından yorumu olmayan ürüne tıklanır$")
    public void listelenenSeçeneklerArasındanYorumuOlmayanÜrüneTıklanır() {
        searchPage.clickNotCommentProduct();
    }
}
