Feature: Teacher toplantilari gorebilmeli, guncelleyebilmeli ve silebilmelidir

  Scenario: Toplantıları silebilmeli


    Given Kullanici ana sayfaya gider
    Then Login butonuna tiklar
    And User Name girer
    And Password u girer
    And Tekrar Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management i secer
    And Meet list de toplantinin Date Start Time Stop Time  Descriptionu gorur
    And Edit butonuna tiklar ve Date de guncelleme yapar
    And Edit butonuna tiklar ve Start Time da guncelleme yapar
    And Edit butonuna tiklar ve Stop Time da guncelleme yapar
    And Edit butonuna tiklar ve Description da guncelleme yapar
    And Silmek istedigi toplantinin karssindaki cop Kutusu butonuna tiklar ve siler