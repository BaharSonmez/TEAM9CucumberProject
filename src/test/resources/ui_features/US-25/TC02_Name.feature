@ADMIN
Feature: Admin, öğrenci oluşturabilme
  Scenario: "Name" girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli ADMİN OLARAK user name ve password u girer
    And Kullanıcı menuden sTudent management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And And Kullanıcı NAME İ boş bırakıp diğer alanlar doldurulup sonra submit e tıklar
    Then Kullanıcı name in altında Required yazısını görür.
    And sayfayi kapatir