Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: Password buyukharf,kucukharf ve bir rakam icermelidir
  Then Kullanici password kutusuna tiklar
  And  Kullanici buyuk harf,rakam,kucuk harf  iceren bir deger girer
  And  Kullanici Submit olan kutusuna tiklar
  And  Kullanici Add teacher successsfully mesajini gorur
  And  Kullanici password kutusuna tiklar
  Then Kullanici buyukharf ve rakam iceren deger girer
  And  Kullanici Submit olan  kutusuna 2.defa  tiklar
  And  Kullanici Add teacher successsfully mesajini gorur
