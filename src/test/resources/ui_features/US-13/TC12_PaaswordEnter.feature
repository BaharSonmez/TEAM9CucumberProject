Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: Password girilmelidir password en az 8 karakterden olusmalidir
  And Kullanici Password kutusuna gider
  Then Kullanci Password kutusuna tiklar
  And  Kullanici Password bilgisi olarak 6 karakter girer
  And  Kullanici "Minimum 8 character" uyarisini alir
  And  Kullanici en az 8 karakter olan bir Password girer