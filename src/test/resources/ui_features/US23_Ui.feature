@US23_UI
Feature: US23


  Background:Login

      Given Admin managementonschools sayfa url'sine gider
      When Admin login butonuna tiklar
      Then Admin username ve password girer
      Then Admin login butonuna tiklar ve login olur
      And Admin Vice Dean Management sayfasini goruntuler

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
      And Admin Birth Place kismina en az 2 karakter girer
      And Admin Birth Place  girilebildigini goruntuler
      And Admin Birth Place  kismini bos birakir
      And Admin Required yazisini goruntuler ve bos birakilamayacagini dogrular

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
      And Admin Date Of Birth kismini gun/ay/yil seklinde doldurur
      And Admin Date of Birth kisminin girilebildigini dogrular

  @US23_TC07
  Scenario:
      And Admin Phone kismina 3-3-4 seklinde minimum 12 karakter girer
      And Admin Phone kismini bos birakir
      And Admin Required yazisini goruntuler ve bos birakilamayacagini dogrular

  @US23_TC08
  Scenario:
      And Admin Phone kismina 4-3-4 seklinde minimum 12 karakter girer
      And Admin name, surname, birth place, gender, date of birth,  ssn, username, password girer
      And Admin submit butonuna tiklar
      And Admin phone number should be exact 12 characters yazisini goruntuler

  @US23_TC09
  Scenario:
      And Admin Phone kismina en az 12 karakterde harf girer
      And Admin name, surname, birth place, gender, date of birth,  ssn, username, password girer
      And Admin submit butonuna tiklar
      And Admin Please entervalid phone number yazisini goruntuler

  @US23_TC10
  Scenario:
      And Admin SSN kismina 3-2-4 seklinde 9 rakam girer
      And Admin SSN kismini bos birakir
      And Admin Required yazisini goruntuler ve bos birakilamayacagini dogrular

  @US23_TC11
  Scenario:
      And Admin SSN kismina 2-3-4 seklinde 9 rakam girer
      And Admin submit butonuna tiklar
      And Admin Submit butonunun aktif olmadigini dogrular

  @US23_TC12
  Scenario:
      And Admin SSN kismina 11 karakterde harf girer
      And Admin submit butonuna tiklar
      And Admin Please enter valid SSN number yazisini goruntuler

  @US23_TC13
  Scenario:
      And Admin Username kismina en az 4 karakter girer
      And Admin Phone kismini bos birakir
      And Admin Required yazisini goruntuler ve bos birakilamayacagini dogrular

  @US23_TC14
  Scenario:
      And Admin Password kismina bir buyuk harf girer
      And Admin Password kismina bir kucuk harf girer
      And Admin Password kismina 6 tane rakam girer
      And Admin Password kismina en az 8 rakam girer
      And Admin Password kismina 8'den az karakter girer
      And Admin Password kismini bos birakir

  @US23_TC15
  Scenario:
    And Admin name kismina 1 karakter girer
    And Admin surname kismina 1 karakter girer
    And Admin birth place kismina 1 karakter girer
    And Admin username kismina 4 den az karakter girer
    And Admin gecerli phone, ssn ve password girer
    And Admin submit butonuna tiklar ve kayit yapamadigini goruntuler