<div>
  <h1>Assignment </h1>
  <ol>
    <li>SOLID Prensiplerine uyarak aşağıdaki projeyi yapmanız beklenmektedir.</li>
    <li>Bir araç kiralama firmasında SUV, Sedan, Hatchback tiplerinde araçlar kiralanabiliyor.</li>
    <li>Bu araç bireysel ya da şirketler tarafından kiralanabilir.</li>
    <li>Bireysel müşteriler tarafından sadece Hatchback araçlar kiralanabilirken, şirketlere tarafından tüm araç tipleri kiralanabilir.</li>
    <li>Yan siteye giriş yapan kullanıcı bireysel müşteri ise sadece Hatchback arabaları görebilir,  şirket ise tüm model araçları görebilir.</li>
    <li>Araçlara çeşitli özellikler eklenmelidir. (Bagaj kapasitesi, renk, yakıt tipi, günlük ya da aylık kiralama ücretleri vs.)</li>
  </ol>
  <p> * Her bir aracın aylık ve günlük kiralama şekilleri modele göre değişmektedir.</p>
  <p> * Örnek: Sedan olanlar aylık olarak kiralanacaksa günlük 300 liradan 30 gün.</p>
  <p> * SUV için aracın yaşına göre ek bir katsayı belirlenip ücret hesaplanabilir.</p>
  <p> * NOT: Buradaki kural setini kendi kural setiniz ile revize edebilirsiniz.</p>
</div>


<div>
  <h1>Solution</h1>
  <h3>Single Responsibility Principle - (Tek Sorumluluk İlkesi) :</h3>
  <ul>
    <li>&Ouml;zetle bir sınıfın veya metotun yalnızca bir sorumluluğu olması gerektiğini belirtir.</li>
    <li>Projemizde 'Car' sınıfı ara&ccedil;ların genel &ouml;zelliklerine odaklanırken, 'MonthlyRentalCar' sınıfı aylık kira &uuml;creti hesaplamaya odaklanmıştır.</li>
    <li>CustomerType sınıfında sadece m&uuml;şteri tipi ile ilgili işlemler bulunmaktadır. Bu y&uuml;zden sınıflar belirli sorumluluklardan oluşur.</li>
  </ul>
</div>


<div>
  <h3>Open/Closed Principle - (A&ccedil;ık/Kapalı Prensip) :</h3>
  <ul>
    <li>&Ouml;zetle kod geliştirilmeye a&ccedil;ık ama değiştirilmeye kapalı olmalıdır.</li>
    <li>Projemizde yeni bir ara&ccedil; t&uuml;r&uuml; eklenebilir, var olan sınıfları değiştirmeye gerek yoktur.</li>
    <li>customerTypeControl() metodu yeni bir m&uuml;şteri tipi eklendiğinde değişiklik gerektirmez.</li>
    <li>onlyHatchbackRental() metodu Hatchback tipinde ara&ccedil; kiralama durumunu kontrol eder. Farklı bir tip ara&ccedil; kontrol etmek istersek bunun i&ccedil;in bu metodu genişletmek yerine yeni bir metot oluşturabiliriz.</li>
  </ul>

  <h3>Liskov Substitution Principle - (Liskov Yerine Koyma Prensibi) : </h3>
  <ul>
    <li>Alt sınıflardan oluşan nesnelerin, &uuml;st sınıfın nesneleri ile yer değiştirdikleri zaman aynı davranışı sergilemesi gerekmektedir.</li>
    <li>'MonthlyRentalCar' sınıfı 'Car' sınıfından t&uuml;remiştir bu y&uuml;zden eğer bir yerde 'Car' sınıfı kullanıldığında 'MonthlyRentalCar' kullanılacağı anlamına gelir.</li>
  </ul>
  <h3>Dependency Inversion Principle - (Bağımlılık Tersine Çevirme Prensibi) : </h3>
  <ul>
    <li>Y&uuml;ksek seviye sınıflarda bir davranış değiştiğinde, alt seviye davranışların bu değişime uyum sağlaması gerekir.</li>
    <li>Yani &uuml;st sınıflar, alt seviyeli sınıflara bağlı olmamalı. Her ikisi de soyutlamalara (abstract class/interface)dayanmalıdır.</li>
    <li>Projemizde 'Car' ve 'MonthlyRentalCar' soyut sınıflar olarak tanımlanmıştır, Hatchback sınıfı bu soyut sınıflardan t&uuml;remiştir. Y&uuml;ksek seviyeli sınıfların d&uuml;ş&uuml;k seviyeli sınıflara doğrudan bağımlı olmadığını ancak aralarında bir soyutlama olduğunu g&ouml;sterir.</li>
  </ul>
</div>
