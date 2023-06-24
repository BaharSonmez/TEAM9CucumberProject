Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario Outline: Telefon numarasi girilmelidir bos birakilamaz
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