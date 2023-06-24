Feature: US08_Choose_Lesson

  Background: Kullanici Managementonschools sitesine gider
    Given Kullanici url sayfasina gider

  Scenario: TC01 Kullanici Vice Dean olarak siteye giris yapar
    When Kullanici sitenin logosunu gorur
    Then Kullanici login olur
    Then Kullanici userName alanina username girer
    And kullanici password alanina password girer
    And Kullanici login butonuna tiklar

  Scenario: TC02 Kullanici Vice Dean olarak Lessons ekleyebilmeli
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
    And  Kullanici Lesson Created mesajini gorur
    And  Ayni ders tekrar secilememeli
    And Ayni ders tekrar girildi hata mesaji alinmali

