Feature:Vice Dean Ogretmen olusturabilmelidir
  Scenario Outline: Ssn girilmelidir ,Ssn 3.ve 5. rakamdan sonra - icermeli ve 9 rakamdan olusmalidir
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