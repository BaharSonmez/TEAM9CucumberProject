@VICE
Feature: Vice Dean, öğrenci oluşturabilme
  Scenario Outline: Password girilebilmelidir. Password en az 8 karakterden oluşmalıdır.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli VİCE DEAN OLARAK user name ve password u girer
    And Kullanıcı menuden student management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı password kısmına "<password>" İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar
    Then Kullanıcı passwordun altında Minimum sekiz character uyarısını görür
    And sayfayi kapatir

    Examples:
      | password |
      | 12456   |
      | 12@45  |