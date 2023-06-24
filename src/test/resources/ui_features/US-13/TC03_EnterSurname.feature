
Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: TC003_Surnmae olusturulabilmelidir bos birakilamaz
 When Kullanici Surname kutusuna gider
 And  Kullanici surnmae kutusuna tiklar
 Then Kullanici Surname kutusuna bilgi girisi yapmaz ve bos birakir
 And  Kullanici Surname kutusuna bilgi girmadiginde "Required" uyarsini alir
 And  Kullanici Surname kutusuna tiklar
 And  Kullanici Surname kutusuna soyisim bilgisini girer
