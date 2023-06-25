@US23_UI
Feature: US23


  Background:Login

      Given Admin managementonschools sayfa url'sine gider
      When Admin login butonuna tiklar
      Then Admin username ve password girer
      Then Admin login butonuna tiklar ve login olur
      And Admin Vice Dean Management sayfasina gider


  @US23_TC01
  Scenario:
      And Admin Name kismina en az iki karakter girer
      And Admin Name girilebildigini goruntuler
      And Admin Name kismini bos birakir
      And Admin Required yazisini goruntuler ve name bos birakilamayacagini dogrular

  @US23_TC02
  Scenario:
      And Admin Surname kismina en az iki karakter  girer
      And Admin Surname girilebildigini goruntuler
      And Admin Surname  kismini bosbirakir
      And Admin Required yazisini goruntuler ve surname bos birakilamayacagini dogrular

  @US23_TC03
  Scenario:
      And Admin Birth Place kismina en az iki karakter girer
      And Admin Birth Place  girilebildigini goruntuler
      And Admin Birth Place  kismini bos birakir
      And Admin Required yazisini goruntuler ve birt placein bos birakilamayacagini dogrular

  @US23_TC04
  Scenario:
      And Admin Gender olarak Male ya da Female secebilir

  @US23_TC05
  Scenario: TC05
      And Admin name, surname, birth place, date of birth, phone, ssn, username, password girer
      And Admin gender kismini bos birakir
      And Admin submit butonuna tiklar
      And Admin submit butonunun aktif olmadigini goruntuler

  @US23_TC06
  Scenario:
      And Admin Date Of Birth  kismini bos birakir
      And Admin Required yazisini goruntuler ve bos birakilamayacagini dogrular
      And Admin Date Of Birth kismini gun,ay,yil seklinde doldurur
      And Admin Date of Birth kisminin girilebildigini dogrular

  @US23_TC07
  Scenario:
      And Admin gecerli bir phone number girer
      And Admin Phone kismini bos birakir
      And Admin Required yazisini goruntuler ve phone bos birakilamayacagini dogrular


  @US23_TC08
  Scenario:
      And Admin Phone kismina dort,uc,dort seklinde minimum on iki karakter girer
      And Admin name, surname, birth place, gender, date of birth,  ssn, username, password girer
      And Admin submit butonuna tiklar
      And Admin phone number should be exact on iki characters yazisini goruntuler

  @US23_TC09
  Scenario:
      And Admin Phone kismina en az on iki karakterde harf girer
      And Admin name, surname, birth place, gender, date of birth,  ssn, username, password girer
      And Admin submit butonuna tiklar
      And Admin Please entervalid phone number yazisini goruntuler

  @US23_TC10
  Scenario:
      And Admin SSN kismina uc iki dort seklinde dokuz rakam girer
      And Admin SSN kismini bos birakir
      And Admin Required yazisini goruntuler ve ssn bos birakilamayacagini dogrular


  @US23_TC11
  Scenario:
      And Admin Username kismina en az dort karakter girer
      And Admin username kismini bos birakir
      And Admin Required yazisini goruntuler ve username bos birakilamayacagini dogrular

  @US23_TC12
  Scenario:
      And Admin Password kismina bir buyuk harf girer
      And Admin Password kismina bir kucuk harf girer
      And Admin Password kismina alti tane rakam girer ve girilebildigini goruntuler
      And Admin Password kismina en az sekiz rakam girer ve girilebildigini goruntuler
      And Admin Password kismina sekizden az karakter girer ve Minimum sekiz character yazisini goruntuler
      And Admin Password kismini bos birakir ve Required yazisini goruntuler

