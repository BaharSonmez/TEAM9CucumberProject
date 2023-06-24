Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: E-mail girilmelidir bos birakilamaz

  Then  Kullanici Email kutusuna tiklar
  And   Kullanici Email kutusunu bos birakir
  And   Kullanici "Required" uyarisi alir
  And   Kullanici Email kutusuna tiklar
  And   Kullanici Email bilgisi girer