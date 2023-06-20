@ADMIN
Feature: Admin, öğrenci oluşturabilme
  Scenario: Mother Name girilmelidir. Boş bırakılamaz.
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanıcı LOG IN e tıklar
    And Kullanıcı geçerli ADMİN OLARAK user name ve password u girer
    And Kullanıcı menuden sTudent management e tıklar
    Then Kullanıcı istediği danışman öğretmeni seçer
    And Kullanıcı tüm bölümleri girdikten sonra submit e tıklar
    Then Kullanıcı STUDENT LIST bölümünde student number ı görür.
    And sayfayi kapatir