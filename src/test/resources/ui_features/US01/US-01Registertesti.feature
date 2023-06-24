@US01
Feature: US-01 RegisterTesti
  Scenario Outline: TC-01 Registration veri girisi
    Given :Kullanici "url" adresine gider
    And :Register butonuna tiklar
    And Kullanici 2 saniye bekler
    Then Kullanici cinsiyet female girer
    And Kullanici 2 saniye bekler
   # And Kullanici isim girer
    Then :Kullanici bilgileri girer "<Name>","<Surname>","<BirthPlace>","<Phone>","<DateOfBirth>","<Ssn>" ,"<UserName>","<Password>"
    And Kullanici 2 saniye bekler
    And Kullanici Register butona tiklar
    And Kullanici 2 saniye bekler
    Then SayfayiKapatir
    Examples:
      | Name    | Surname | BirthPlace | Phone        | DateOfBirth | Ssn         | UserName    | Password    |
      | gulsumm | sevill  | istanbull  | 123-456-5800 | 31011981    | 923-45-6780 | kulsumyavuz | kulsumyavuz |
