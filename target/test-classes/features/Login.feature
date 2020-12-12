
@Giris_Sayfası
  Feature:Hepsi burada test senaryoları

    @Geçerli_kullanıcı_ile_uygulamaya_giriş_kontrolü
    Scenario Outline: Geçerli kullanıcı ile uygulamaya giriş kontrolü
      And Hepsi burada web sitesinde login butonuna tıklanır
      And Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarılı giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarılı giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır
      And Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir

      Examples:
        | username | parola |
        | yesimtestautomation@hotmail.com| H.12345 |

    @Geçerli_kullanıcı_ile_başarılı_giriş_yaptıktan_sonra_ürüne_yorum_yapılması
    Scenario Outline: Geçerli kullanıcı ile başarılı giriş yaptıktan sonra ürüne yorum yapılması
      And Hepsi burada web sitesinde login butonuna tıklanır
      And Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarılı giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarılı giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır
      And Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      And Giriş yaptıktan sonra arama bölümünün geldiği kontrol edilir
      And Ürün ismi yazılarak arama butonuna tıklanır ve arama alanına <product> yazılır
      And Listelenen seçenekler arasından istenilen ürüne tıklanır
      And Ürün detayında Yorumlar tabına gidilir
      And Yorumlar içinden ilk yorumun Evet butonuna basılır
      And Kullanıcı Teşekkür ederiz yazısını görür

      Examples:
        | username | parola | product |
        | yesimtestautomation@hotmail.com | H.12345 | iphone7 |

    @Geçerli_kullanıcının_yorumlar_tabında_hiç_yorum_gelmiyorsa_herhangi_bir_işlem_yapmaması
    Scenario Outline: Geçerli kullanıcının yorumlar tabında hiç yorum gelmiyorsa herhangi bir işlem yapmaması
      And Hepsi burada web sitesinde login butonuna tıklanır
      And Hepsi burada web sitesinde açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarılı giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarılı giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçerli bilgilerden sonra giriş butonuna tıklanır
      And Başarılı giriş yapıldığına dair anasayfanın geldiği kontrol edilir
      And Giriş yaptıktan sonra arama bölümünün geldiği kontrol edilir
      And Ürün ismi yazılarak arama butonuna tıklanır ve arama alanına <product> yazılır
      And Listelenen seçenekler arasından yorumu olmayan ürüne tıklanır
      And Yorumu olmayan ürün detayında Yorumlar tabına gidilir

      Examples:
        | username | parola | product |
        | yesimtestautomation@hotmail.com | H.12345 | Kablosuz Dijital Mikroskop |

    @Geçersiz_kullanıcı_ile_uygulamaya_giriş_kontrolü
    Scenario Outline: Geçersiz kullanıcı ile uygulamaya giriş kontrolü
      And Hepsi burada web sitesinde giriş yap butonuna tıklanır
      And Açılan listeden giriş yap butonuna tıklanır
      And Giriş yap ekranında başarısız giriş için kullanıcı adı alanına <username> yazılır
      And Giriş yap ekranında başarısız giriş için parola alanına <parola> yazılır
      And Giriş yap ekranında girilen geçersiz bilgilerden sonra giriş butonuna tıklanır
      And E posta adresiniz ya da şifreniz yanlış uyarı mesajının geldiği kontrol edilir

      Examples:
        | username | parola |
        | yesimtestautomation@hotmail.com | H.123456 |
