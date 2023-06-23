Feature: US05_ADMIN_DEAN

  Background: Kullanici_admin_hesabi_ile_giris_yapar
    Scenario: TC_01
    Given Kullanici Siteye giris yapar
    And "Name" girilmelidir. Boş bırakılamaz.
    And "Surname" girilmelidir. Boş bırakılamaz.
    And "Birth Place" girilmelidir. Boş bırakılamaz.
    And Cinsiyet seçilmelidir. Boş bırakılamaz.
    And  Doğum tarihi girilmelidir. Boş bırakılamaz.
    And Telefon numarası girilmelidir. Boş bırakılamaz.
    And SSN girilmelidir.  SSN; 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. Boş bırakılamaz.
    And User Name girilmelidir. Boş bırakılamaz.
    And Password girilebilmelidir. Password en az 8 karakterden oluşmalıdır.
    And Password; büyük harf, küçük harf ve bir rakam içermelidir.