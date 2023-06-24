@teacher
  Feature:Teacher ogrencilerile toplanti duzenleyebilmeli

    Scenario:Choose Students ogrenci secebilmeli
      Given Kullanici ana sayfaya gider
      Then Login butonuna tiklar
      And User Name girer
      And Password u girer
      And Tekrar Login butonuna tiklar
      And Menu butonuna tiklar
      And Meet Management i secer
      And Add Meet den Choose Students i tiklar ve cikan listeden  ogrenci secer
