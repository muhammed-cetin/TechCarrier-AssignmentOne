# Assignment

Bu proje, SOLID prensiplerine uyarak aşağıdaki problemi çözmeyi amaçlamaktadır.

1. Bir araç kiralama firmasında SUV, Sedan, Hatchback tiplerinde araçlar kiralanabiliyor.
2. Araçlar bireysel ya da şirketler tarafından kiralanabilir.
3. Bireysel müşteriler sadece Hatchback araçlar kiralayabilir, şirketler ise tüm araç tiplerini kiralar.
4. Yan siteye giriş yapan kullanıcı bireysel müşteri ise sadece Hatchback arabaları görebilir, şirket ise tüm model araçları görebilir.
5. Araçlara çeşitli özellikler eklenmelidir (bagaj kapasitesi, renk, yakıt tipi, günlük ya da aylık kiralama ücretleri vb.).

Notlar:
- Her bir aracın aylık ve günlük kiralama ücretleri modele göre değişmektedir.
- Örnek: Sedan olanlar aylık olarak kiralanacaksa günlük 300 liradan 30 gün.
- SUV için aracın yaşına göre ek bir katsayı belirlenip ücret hesaplanabilir.

# Solution

## Single Responsibility Principle (Tek Sorumluluk İlkesi)

- `Car` sınıfı araçların genel özelliklerine odaklanırken, `MonthlyRentalCar` sınıfı aylık kira ücreti hesaplamaya odaklanmıştır.
- `CustomerType` sınıfında sadece müşteri tipi ile ilgili işlemler bulunmaktadır, bu nedenle sınıflar belirli sorumluluklardan oluşur.

## Open/Closed Principle (Açık/Kapalı Prensip)

- Yeni bir araç türü eklenebilir, var olan sınıfları değiştirmeye gerek yoktur.
- `customerTypeControl()` metodu yeni bir müşteri tipi eklendiğinde değişiklik gerektirmez.
- `onlyHatchbackRental()` metodu Hatchback tipinde araç kiralama durumunu kontrol eder.

## Liskov Substitution Principle (Liskov Yerine Koyma Prensibi)

- `MonthlyRentalCar` sınıfı `Car` sınıfından türemiştir. Bu nedenle eğer bir yerde `Car` sınıfı kullanılıyorsa, `MonthlyRentalCar` kullanılabilir.

## Dependency Inversion Principle (Bağımlılık Tersine Çevirme Prensibi)

- Yüksek seviyeli sınıflarda bir davranış değiştiğinde, alt seviye davranışların bu değişime uyum sağlaması gerekir.
- Yani üst sınıflar, alt seviyeli sınıflara bağlı olmamalı. Her ikisi de soyutlamalara (abstract class/interface) dayanmalıdır.
- `Car` ve `MonthlyRentalCar` soyut sınıflar olarak tanımlanmıştır, `Hatchback` sınıfı bu soyut sınıflardan türemiştir.
