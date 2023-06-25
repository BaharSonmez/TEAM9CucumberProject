

Feature: Vice Dean Ogretmene ders atayabilmeli

  Scenario:TC_01 Ders programi olusturulmalidir
    Given Kullanıcı _"https://managementonschools.com/" sayfasina gider
    When Kullanici Login butonuna tiklar
    And  Kullanici usernmae kutusuna tiklar
    Then Kullanici username kutusuna AdminB129 girer ve alt kutucuga gecer
    And  Kullanici password kutusuna 12345678 bilgisini girer ve tiklar
    Then Kullanici Vice Dean olarak Login olur
    And  Kullanici  acilan sayfada ust kisimda AdminB129 gorebilmeli
    And  Kullanici Menu butonuna tiklar
    Then Kullanici Main Menu altinda Lesson Management secenegine tiklar
     And Kullanici Lesson Program kutusuna tiklar
     And Kullanici Add Lesson Program seceneklerini gorebilmeli
     Then Kullanici Choose Lessons bolumundeki Select Lesson kutusunua tiklar
     And  Kullanici acilan kutudan dersler gorunur ve secilir olmali
     Then Kullanici Choose lessontan bir ders secer ve tiklar
     And  Secilen ders  arama cubukta gorunur olmali
     And  Kullanici Choose Education Term secenegi kutusunu gorebilmeli
     Then Kullanici Choose Education Term kutusuna tiklar
     And  Kullanici kutuda Terms seceneklerini gorebilmeli
     And  Kullanici Term seceneklerinden birinin uzerine tiklar
     And  Kullanici sectigi SPRING_SEMESTER secili oldugunu gorebilmeli
     Then Kullanici Choose Day kutusunu gider
     And  Kullanci Choose Day kutusuna tiklar
     And  Kullanici bir gun secer
     Then Kullanici Monday yazisini kutuda gorebilmeli
     And  Kullanici Start Time kutusuna gider
     Then Kullanici Start Time kutusuna tiklar
     And  Kullanici ikili secenekten "08"ve "30" olarak ikili secimi yapar
     And  Kullanici kutucukta sectigi saati gerebilmeli
     And  Kullanici Stop Time kutusuna gider
     Then Kullanici Stop Time kutusuna tiklar
     And  Kullanici ikili secenekten   stop time "09" ve "30" olarak ikili secimi yapar
     Then Kullanci SUBMIT secenegi kutusunu grebilmeli
     And  Kullanici Submit butonuna tiklar
     And  Kullanici Created Lesson Program Alert yazsisni gorebilmeli
     And  Sayfayi kapatir

  





