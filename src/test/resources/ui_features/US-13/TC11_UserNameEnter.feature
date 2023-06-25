Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: User name girilmelidir bos birakilamaz
  And  Kullanici UserName kutusuna tiklar
  Then Kullanici Username kismini bos birakir
  And  Kullanici "Required" uyarisi alir
  Then Kullanici Usernmae kutusuna tekrar tiklar
  And  Kullanici bir Usernmae bilgisi girer