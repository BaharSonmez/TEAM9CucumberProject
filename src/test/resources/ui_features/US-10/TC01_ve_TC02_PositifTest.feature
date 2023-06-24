@Vice
Feature: US10_Choose_Lesson

  Scenario: TC01 Kullanici Vice Dean olarak siteye giris yapar
    Given Kullanici url sayfasina gider

    When Kullanici sitenin logosunu gorur
    Then Kullanici login olur
    Then Kullanici userName alanina username girer
    And  kullanici password alanina password girer
    And  Kullanici login butonuna tiklar

    When Kullanici Lesson Program butonunu gorur
    Then Kullanici Lesson Program butonuna tiklar
    And Kullanici Lesson program Management yazisini gorur
    And Kullanici Choose lessons alanina tiklar
    And Kullanici secilecek dersi Choose Lessons alana yazar
    And Kullanici Choose Education Term alanina  tiklar
    And Kullanici FAlL_SEMESTER secenegini secer
    And Kullanici MONDAY secenegini secer
    And Kullanici ders baslangic saat ve dakikasini  secer
    And Kullanici Stop Time alanina tiklar
    And Kullanici ders bitis saat ve dakikasini secer
    And Kullanici submit butonuna tiklar
    And Kullanici  onay mesajini gorur
    And Kullanici siteden cikar