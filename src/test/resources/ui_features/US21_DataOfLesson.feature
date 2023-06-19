Feature: US21_DataofLesson

  Background: Kullanici login yapar
    Given kullanıcı management sayfasına gider
    Then kullanıcı login butonuna tıklar
    And kullanıcı login giris butonuna tıklar
    And kullanıcı username kısmını doldurur
    And kullanıcı password kısmını doldurur
    And kullanıcı login giris butonuna tıklar



  Scenario: TC01_ShowDataofLesson
    Given kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür

  Scenario: TC02_ChooseLesson
    Given kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür
    And kullanıcı istediği dersleri seçer

  Scenario: TC03_TakeaAlertMessage
    Given kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür
    And kullanıcı istediği dersleri seçer
    And kullanıcı aynı gün ve aynı saatte olan dersleri seçtiğinde uyarı mesajı alır

  Scenario: TC04_DeleteToLesson
    Given kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür
    And kullanıcı istediği dersleri seçer
    And kullanıcı aynı gün ve aynı saatte olan dersleri seçtiğinde uyarı mesajı alır
    And kullanıcı seçtiği bir dersi siler

  Scenario: TC05_ShowLessonProgramList
    Given kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür
    And kullanıcı istediği dersleri seçer
    And kullanıcı aynı gün ve aynı saatte olan dersleri seçtiğinde uyarı mesajı alır
    And kullanıcı seçtiği bir dersi siler
    And kullanıcı seçtiği dersleri Lesson Program Listte görür

  Scenario: TC06_ShowExamPoint
    Given kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür
    And kullanıcı istediği dersleri seçer
    And kullanıcı aynı gün ve aynı saatte olan dersleri seçtiğinde uyarı mesajı alır
    And kullanıcı seçtiği bir dersi siler
    And kullanıcı seçtiği dersleri Lesson Program Listte görür
    And kullanıcı sağ üstten menü bölmesine tıklar
    And Kullanıcı acılan pencereden grades and announcement bölümüne tıklar
    And kullanıcı açılan sayfada sınav notlarını görür

  @ChooseLesson
  Scenario: TC07_ShowCreateOfMeeting
    Given kullanıcı acılan bolumde teacher day, start time ve stop time bilgilerini görür
    And kullanıcı istediği dersleri seçer
    And kullanıcı aynı gün ve aynı saatte olan dersleri seçtiğinde uyarı mesajı alır
    And kullanıcı seçtiği bir dersi siler
    And kullanıcı seçtiği dersleri Lesson Program Listte görür
    And kullanıcı sağ üstten menü bölmesine tıklar
    And Kullanıcı acılan pencereden grades and announcement bölümüne tıklar
    And kullanıcı açılan sayfada sınav notlarını görür
    And kullanıcı acılan sayfada kendisi icin olusturulan toplantıları gorur