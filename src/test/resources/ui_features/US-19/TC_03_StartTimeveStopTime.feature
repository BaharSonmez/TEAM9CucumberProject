Feature:Teacher ogrenciler ile toplanti duzenleyebilmeli

  Scenario: Date Of Meet toplanti zamani secilebilmeli gecmis tarih girilmemeli

    Given Kullanici ana sayfaya gider
    Then Login butonuna tiklar
    And User Name girer
    And Password u girer
    And Tekrar Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management i secer
    And Add Meet den Choose Students i tiklar ve cikan listeden  ogrenci secer
    And Date Of Meet e tiklar ve ileriki bir tarihi girer
    And Date Of Meet e tiklar ve gecmis bir tarihi girer
    And Start Time tiklar ve saat girer
    And Stop Time tiklar ve saat girer
