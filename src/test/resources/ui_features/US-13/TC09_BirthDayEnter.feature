Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario Outline: Dogum tarihi girilmelidir bos birakilamaz
    When  Kullanici "<Date Of Birth>" kutucuguna gide
    And   Kullanici "<Date Of Birth>" kutucugunu bos birakir
    Then  Kullanici "Required" uyarisni alir
    And   Kullanici "<Date Of Birth>" kutucuguna tekrar tiklar
    And   Kullanici "<Date Of Birth>" bilgisi  girer
    Examples:
      | Date Of Birth |
      | 19/03/1983    |