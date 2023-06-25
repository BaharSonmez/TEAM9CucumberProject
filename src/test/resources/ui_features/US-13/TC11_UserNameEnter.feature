Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario Outline: User name girilmelidir bos birakilamaz
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
    When Kullanici Surname kutusuna gider
    And  Kullanici surnmae kutusuna tiklar
    Then Kullanici Surname kutusuna bilgi girisi yapmaz ve bos birakir
    And  Kullanici Surname kutusuna bilgi girmadiginde "Required" uyarsini alir
    And  Kullanici Surname kutusuna tiklar
    And  Kullanici Surname kutusuna soyisim bilgisini girer
    And Kullanici Birth Place kutusuna tiklar
    And Kullanici Birth Place kutusunu bos birakir ve bilgi girisi yapmaz
    And Kullanici "Required" uyarisini alir
    Then Kullanici Birth Place kutusuna gider  tiklar
    And  Kullanici Birth place bilgisi girer
    Then  Kullanici Email kutusuna tiklar
    And   Kullanici Email kutusunu bos birakir
    And   Kullanici "Required" uyarisi alir
    And   Kullanici Email kutusuna tiklar
    And   Kullanici Email bilgisi girer
    When  Kullanici  Phone kutuusna gider
    And   Kullanici Phone kutusuna bilgi girmez ve bos birakir
    Then  Kullanici "Required " uyarisi alir
    And   Kullanici phone kutuusna rakam disinda "<telefon numarasi>" girer
    Then  Kullanici rakam disinda "<telefon numarasi>"girdiginde uyari alir
    And   Kullanici "<telefon numarasi>" rakam degeri girer her 3 rakamda aralirina - isareti koymaz
    Then  Kullanicinin girdigi deger kabul edilmez
    And   Kullanci "<telefon numarasi>"phone bilgisini girer ve3 rakamdan sonra araya "-" karakterini koyar
    And   Kullanicinin girdigi tel bilgisi onaylanir
    Examples:
      |telefon Numarasi  |
      | abng345          |
      |234567899         |
      |444-666-5678      |
    And   Kullanici "Is Adviser Teacher " kutucuguna gider
    Then  Kullanici kutucuga tiklar
    When  Kullanici "<Date Of Birth>" kutucuguna gide
    And   Kullanici "<Date Of Birth>" kutucugunu bos birakir
    Then  Kullanici "Required" uyarisni alir
    And   Kullanici "<Date Of Birth>" kutucuguna tekrar tiklar
    And   Kullanici "<Date Of Birth>" bilgisi  girer
    Examples:
      | Date Of Birth |
      | 19/03/1983    |
    And  Kullanici SSN kutusuna gider
    Then Kullanci SSN kutusunu bos birakir
    And  Kullanici Required uyarisini alri
    And  Kullanici "<SSN Bilgisi>" olarak 3.ve 5. rakamlardan sonra "-" iceren bilgi girer
    When Kullanici Minimum 11 character uyarisini almaz
    And  Kullanici"<SSN Bilgisi>" 3. ve 5. rakamlardan sonra "-" icermeyen deger girer
    And  Kullanicinin girdigi sayi ve karakter bilgisi sistem tarafindan onaylanmaz ve uyari mesajini gorur
    Examples:
      | SSN Bilgisi  |
      | 345-45-789088|
      | 34567890-dsd |
  And  Kullanici UserName kutusuna tiklar
  Then Kullanici Username kismini bos birakir
  And  Kullanici "Required" uyarisi alir
  Then Kullanici Usernmae kutusuna tekrar tiklar
  And  Kullanici bir Usernmae bilgisi girer