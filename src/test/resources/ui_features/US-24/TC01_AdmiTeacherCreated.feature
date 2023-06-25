
Feature:  Admin Teacher olusturabilmeli
Scenario Outline:TC001 Admin hesabi ile Teacher olusturulabilmeli
 Given Kullanici ilgili sayfaya tiklar ve  gider
 And Kullanici ilgili sayfaya gider
 Then Kullanici Login butonuna tiklar
 And Kullanici " <Username>" kutusuan AdminB129 girer
 And Kullanici Password2 kutusuna tiklar
 Then Kullanici "<Password>" olarak 12345678 bilgisini girer
 And Kullanici Menu kutusuna gider
 Then Kullanici Menu kutusuna tiklar
 And Kullanici acilan sayfada Teacher Management kutusuna gelir
 Then Kullanici Teacher Managemnet secenegini tiklar
 And Kullanici Add Teacher sayfasini gorur
 And Kullanici Choose Lessons kutusuna gelir
 And Kullanici ilgili kutucukta saga tiklar
 Then Kullanici ders seceneklerini gorur
 And Kullanici derslerden Java uzerine gelip tiklar
 Then Kullanici Name kutusuna gelir
 And Kullanici "<Name>" bilgisini girer
 Then Kullanici surname kutusuna gider
 And Kullanici "<Surname>" bilgisini kutuya  girer
 Then Kullanici Birth Place kutusuna gider
 And Kullanici "<Birth Place>" bilgisini girebilmeli
 And Kullanici emailkutusuna gelir
 Then Kulalnici "<email>" bilgisini girer
 And Kullanici Phone kutusuna gelir
 Then Kullanici "<Phone>"  numarasini bilgisini girer
 And Kullanici "Is Advisor Teacher" yazisindaki kutucuga gider
 Then Kullanici iilgili kutucuga tiklar
 And Kullanci Gender sceneklerinin oldugu yere gelir
 Then Kullanici Female ve Male kutucuklarindan birine tiklar
 And Kullanici Date of Birth kutucuguna gelir ve sag taraftaki takvim isaretine tiklar
 And Kullanici"<Date Of Birth>" secer
 And Kullanici Ssn kutucuguna gider
 Then Kullanici "<Ssn>" bilgisini  rakam olarak girer
 And Kullanici User Name kutucuguna gelir
 Then Kullanici "<User name>" kutusuna bilgisi girer
 And Kullanici Password kutucuguna gelir
 And Kullanici "<Password>" girebilmeli
 And Kullanici Submit kutucugun gelir
 And Kullanici Submit3 kutusuna tiklar
 And Kullanici "Teacher saved Successfully" onay yazisini gorur
 Examples:
  | Username | Password | Name | Surname | Birth Place | email                  | Phone      | Date Of Birth | Ssn | User name |
  | AdminB129| 12345678 |Bahar | Sonmez  | Kirklareli  | Vefasonmezams@gmail.com|222-444-5555| 22/02/1992    |445  | Bahar     |