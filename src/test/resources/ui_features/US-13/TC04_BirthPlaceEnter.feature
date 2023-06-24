Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: Birthplace girilmelidir bos birakilamaz
  And Kullanici Birth Place kutusuna tiklar
  And Kullanici Birth Place kutusunu bos birakir ve bilgi girisi yapmaz
  And Kullanici "Required" uyarisini alir
  Then Kullanici Birth Place kutusuna gider  tiklar
  And  Kullanici Birth place bilgisi girer