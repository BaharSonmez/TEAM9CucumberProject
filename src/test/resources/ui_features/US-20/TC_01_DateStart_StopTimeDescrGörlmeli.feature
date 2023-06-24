Feature: Teacher toplantilari gorebilmeli, guncelleyebilmeli ve silebilmelidir

  Scenario: Toplantıların,Date, Start Time, Stop Time ve Description görülmeli


    Given Kullanici ana sayfaya gider
    Then Login butonuna tiklar
    And User Name girer
    And Password u girer
    And Tekrar Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management i secer
    And Meet list de toplantinin "Date,"Start Time","Stop Time","Description" u gorur