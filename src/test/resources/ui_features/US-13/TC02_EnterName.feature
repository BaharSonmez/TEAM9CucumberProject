
Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: TC002_Name girilmelidir bos birakilamaz
  When Kullanici Name kutuusna gider
  Then Kullanici Name kutusunu bos birakir
  And  Kullanci Name kutusuna bilgi girmediginde "Required" uyarisi alir
  And  Kullanici Name kutusuna tiklar
  And  Kullanici Name kutusuna Isim bilgisi girer