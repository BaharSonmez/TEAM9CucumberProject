Feature: US08_Choose_Lesson





  Scenario: TC01 Kullanici Vice Dean olarak siteye giris yapar
    Given Kullanici url sayfasina gider

    When Kullanici sitenin logosunu gorur
    Then Kullanici login olur
    Then Kullanici userName alanina username girer
    And  kullanici password alanina password girer
    And  Kullanici login butonuna tiklar
    When Lessons butonu gorunur olmalidir
    Then Kullanici Lessons butonuna tiklar
    And  Lesson Management yazisi gorunur olmalidir
    And  Kullanici Lesson Name bolumune ders ismi girer
    And  Kullanici Compulsory butonuna tiklar
    And  Kullanici Credit Score bolumune kredi notu girer
    And  Kullanici Submit butonuna tiklar


    And Kullanici ekledigi dersleri gorene kadar sayfayi asagi ceker
    And Kullanici Lesson name alaninda eklenen dersi gorur
    And Kullanici Compulsory alaninda Yes yazisini gorur
    And Kullanici Credit Score alaninda kredi notunu gorur