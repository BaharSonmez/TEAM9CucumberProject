Feature: US22_NewAddAdmin


  Background: Kullanici login yapar
    Given kullanıcı managementschool sayfasına gider
    Then kullanıcı log ın  butonuna tıklar
    And kullanıcı admin olarak username kısmını doldurur
    And kullanıcı admin olarak password kısmını doldurur
    And kullanıcı log ın giris butonuna tıklar

  Scenario: TC01_FillName
    And kullanıcı name kutucugunu doldurur

  Scenario: TC02_FillSurname
    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur

  Scenario: TC03_FillBirtplace
    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur
    And kullanıcı birth place yerini doldurur

  Scenario: TC04_FillSex
    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur
    And kullanıcı birth place yerini doldurur
    And kullanıcı cinsiyetini seçer

  Scenario: TC05_FillDateOfBirth

    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur
    And kullanıcı birth place yerini doldurur
    And kullanıcı cinsiyetini seçer
    And kullanıcı date of birth bölümünü doldurur

  Scenario: TC06_FillPhoneNumber

    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur
    And kullanıcı birth place yerini doldurur
    And kullanıcı cinsiyetini seçer
    And kullanıcı date of birth bölümünü doldurur
    And kullanıcı phone kısmını doldurur

  Scenario: TC07_FillSsnNumber

    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur
    And kullanıcı birth place yerini doldurur
    And kullanıcı cinsiyetini seçer
    And kullanıcı date of birth bölümünü doldurur
    And kullanıcı phone kısmını doldurur
    And kullanıcı Ssn kısmını doldurur

  Scenario: TC08_FillUserName

    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur
    And kullanıcı birth place yerini doldurur
    And kullanıcı cinsiyetini seçer
    And kullanıcı date of birth bölümünü doldurur
    And kullanıcı phone kısmını doldurur
    And kullanıcı Ssn kısmını doldurur
    And kullanıcı username kutucugunu doldurur

  @NewAddAdmin
  Scenario: TC09_FillPassword

    And kullanıcı name kutucugunu doldurur
    And kullanıcı surname kutucugunu doldurur
    And kullanıcı birth place yerini doldurur
    And kullanıcı cinsiyetini seçer
    And kullanıcı date of birth bölümünü doldurur
    And kullanıcı phone kısmını doldurur
    And kullanıcı Ssn kısmını doldurur
    And kullanıcı username kutucugunu doldurur
    And kullanıcı password kutucugunu doldurur
    And kullanıcı submit butonuna tıklar