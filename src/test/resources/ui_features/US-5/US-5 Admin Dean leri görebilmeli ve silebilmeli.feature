Feature: US05_ADMIN_DEAN

  Background: Kullanici_admin_hesabi_ile_giris_yapar
    Given Dean listesini acar
    Then Bir Dean'i seçer
    And Seçilen Dean'in adı, cinsiyeti, telefon numarası, SSN ve kullanıcı adı görüntülenmelidir.


    Scenario:TC_02
    Given Admin Deanleri silebilmeli  1-Adımlar:Admin hesabıyla giriş yap
    And Dean listesini aç.
    And ilinecek bir Dean'i seç. Sil butonuna tıkla.
    And Onay isteyen bir mesaji gorur
    And Onay vermek için "Evet" veya "Sil" butonuna tıkla.
    And eçilen Dean başarıyla silinnir
      Scenario: TC_03
    And  Admin Deanleri günceleyebilmeli 1-Admin hesabıyla giriş yap.
    And Dean listesini aç.
    And Güncellenecek bir Dean'i seç.
    And Güncelleme düğmesine tıkla.
    And İlgili alanları güncelle.
    And Seçilen Dean'in adı, cinsiyeti, telefon numarası, SSN ve kullanıcı adı başarıyla güncellenmelidir.


