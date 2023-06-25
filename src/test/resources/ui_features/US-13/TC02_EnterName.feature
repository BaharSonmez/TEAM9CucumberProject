
Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario: TC002_Name girilmelidir bos birakilamaz
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When  Kullanici acilan sayfada login butonuna tiklar
    And   Kullanici username kismina AdminB129 bilgisini girer
    And   Kullanici Ppassword okutusuna 12345678 bilgisini girer
    Then  Kullanici Vice Dean olarak Login olur
    And   Kullanici  acilan sayfada ust kisimda AdminB129 gorebilmeli
    When  Kullanici Menu butonuna tiklar
    And   Kullanici Teacher Management secenegini gorebilmeli
    And   Kullannici  Teacher Management kismi tiklanabilir olmali
    And   Acilan sayfada AddTeacher ve Choose Lessons kutusu gorunur olmali
    Then  Kullanici Choose Lesson kutusuna tiklar
    And   Admin olarak kullanici acilan kutudaki derslerden birisini secip uzerine tiklar
   When Kullanici Name kutuusna gider
   Then Kullanici Name kutusunu bos birakir
   And  Kullanci Name kutusuna bilgi girmediginde "Required" uyarisi alir
   And  Kullanici Name kutusuna tiklar
   And  Kullanici Name kutusuna Isim bilgisi girer