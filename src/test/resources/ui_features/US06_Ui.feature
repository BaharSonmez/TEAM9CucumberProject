@US06_UI
Feature: US06


  Background:Login

    Given Dean managementonschools sayfa url'sine gider
    When Dean login butonuna tiklar
    Then Dean username ve password girer
    Then Dean login butonuna tiklar ve login olur



  @US06_TC01
  Scenario:
    And Dean Name kismina en az iki karakter girer
    And Dean Name girilebildigini goruntuler
    And Dean Name kismini bos birakir
    And Dean Required yazisini goruntuler ve name bos birakilamayacagini dogrular

  @US06_TC02
  Scenario:
    And Dean Surname kismina en az iki karakter  girer
    And Dean Surname girilebildigini goruntuler
    And Dean Surname  kismini bosbirakir
    And Dean Required yazisini goruntuler ve surname bos birakilamayacagini dogrular

  @US06_TC03
  Scenario:
    And Dean Birth Place kismina en az iki karakter girer
    And Dean Birth Place  girilebildigini goruntuler
    And Dean Birth Place  kismini bos birakir
    And Dean Required yazisini goruntuler ve birt placein bos birakilamayacagini dogrular

  @US06_TC04
  Scenario:
    And Dean Gender olarak Male ya da Female secebilir

  @US06_TC05
  Scenario: TC05
    And Dean name, surname, birth place, date of birth, phone, ssn, username, password girer
    And Dean gender kismini bos birakir
    And Dean submit butonuna tiklar
    And Dean submit butonunun aktif olmadigini goruntuler

  @US06_TC06
  Scenario:
    And Dean Date Of Birth  kismini bos birakir
    And Dean Required yazisini goruntuler ve bos birakilamayacagini dogrular
    And Dean Date Of Birth kismini gun,ay,yil seklinde doldurur
    And Dean Date of Birth kisminin girilebildigini dogrular

  @US06_TC07
  Scenario:
    And Dean gecerli bir phone number girer
    And Dean Phone kismini bos birakir
    And Dean Required yazisini goruntuler ve phone bos birakilamayacagini dogrular


  @US06_TC08
  Scenario:
    And Dean Phone kismina dort,uc,dort seklinde minimum on iki karakter girer
    And Dean name, surname, birth place, gender, date of birth,  ssn, username, password girer
    And Dean submit butonuna tiklar
    And Dean phone number should be exact on iki characters yazisini goruntuler

  @US06_TC09
  Scenario:
    And Dean Phone kismina en az on iki karakterde harf girer
    And Dean name, surname, birth place, gender, date of birth,  ssn, username, password girer
    And Dean submit butonuna tiklar
    And Dean Please entervalid phone number yazisini goruntuler

  @US06_TC10
  Scenario:
    And Dean SSN kismina uc iki dort seklinde dokuz rakam girer
    And Dean SSN kismini bos birakir
    And Dean Required yazisini goruntuler ve ssn bos birakilamayacagini dogrular


  @US06_TC11
  Scenario:
    And Dean Username kismina en az dort karakter girer
    And Dean username kismini bos birakir
    And Dean Required yazisini goruntuler ve username bos birakilamayacagini dogrular

  @US06_TC12
  Scenario:
    And Dean Password kismina bir buyuk harf girer
    And Dean Password kismina bir kucuk harf girer
    And Dean Password kismina alti tane rakam girer ve girilebildigini goruntuler
    And Dean Password kismina en az sekiz rakam girer ve girilebildigini goruntuler
    And Dean Password kismina sekizden az karakter girer ve Minimum sekiz character yazisini goruntuler
    And Dean Password kismini bos birakir ve Required yazisini goruntuler



