# Projem
 Bu projede kullanıcımız ; sql bağlantısı sayesinde, sql kodlarıyla uğraşmadan kolay bi şekilde veri ekleyip, 4000 küsür veri içerisinde arama yapabilmektedir.

 ### Bu proje bana 

- Database ile java bağlantısı kurmayı;
- Database'i açıp yazılan kodları açmadan bağlantı sayesinde java kodlarıyla çalıştırmayı;
- Netbrains IDE sini kullanmayı;
- Java kodlarıyla arayüz tasarlamayı;
- Tasarladığımız arayüzde tıklayark veya yazarak girdiğimiz inputları bazı fonksiyonlarla çalıştırarak aldığımız outputları arayüzde gösterebilmeyi vb.;
- Bu input ve output işlemlerini, 4000 veriden oluşan bir DB'de arayüz kullanarak arama ve ekleme yapma ile birleştirmeyi;
- **Öğretti** ve kendimi geliştirmemde birçok katkı sağladı.;


# Projeyi çalıştırmak için adımları izleyin:
  
## 1- `Netbrains ve java Kurduktan sonra`

## 2- `jsqlcon project`  isimli dosyayı indirip Netbrainsle açıyoruz **trust the project** diyoruz

## 3- Sonrasında `src` ye tıklıyoruz aşşağıya doğru açılan dosyalardan `demo.java` dosyasını çalıştırıyoruz.
> ### Nasıl işler(Görsel) kısmında görsel içeriklerle nasıl kullanabiliceğinize bakabilirsiniz

## 4- Yüksek ihtimalle **Çalışmıyacaktır** sebepleri ise: gereken paketleri import etmemiş olmanız, Benim projemde kullandığım sql username,password,dburl değişkenlerinin aynı olmaması ve kullandığım sql databaseine sahip olmamanız olarak sıralayabiliriz. Çözümleri ise:

> ### Gereken paketlerin import edilmesi için kullandığınız IDE'de çıkan uyarıların üstüne tıklayın böylece gereken paketler yüklenecektir.

> ### Kullandığım sql database i `mysql 8.0.15` ile birlikte geliyor yani örnek bir database sizde aynı sürümü indirirseniz tutorial olarak gelecek veyahut internetten temin edebilirsiniz.

> ### Verdiğim kodda gördüğünüz üzere username password ve dburl gözükmekte olup aynı isim şifre ve localhost portunda olan db yi tanıyacaktır.

 ```java
    private String userName = "root";
    private String password = "root";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSl=false&serverTimezone=UTC";
```
## 5- Bu adımları gerçekleştirdikten sonra da kod çalışmaz ise bana mail adresimden ulaşabilirsiniz.
[Mail adresim](https://numanbey11@gmail.com)

## 6-  `demo.java` dosyasını sorunsuz çalıştırdıktan sonra karşımıza arayüz çıkacaktır bu arayüzde üst kısımda **Arama çubuğu** bulunmakta olup bu çubuk içine yazmaya başladığınız andan itibaren arama işlemi başlar. Tam ifade girildiği anda veri karşınıza çıkacaktır. 
> ### örnek olarak A yazdığınız anda içinde A geçen bütün kayıtlar gelicektir An yazdığınızda tüm An geçen kayıtlar gibi gibi...

## 7- Listenin sağında bulunan scroll ile de göz taraması yapabilirsiniz.

## 8- Arama dışında bir de ekleme için alt tarafta veri giriş bölümleri ve ekle butonumuz var. Buradan da  DB'mize veri ekleyebiliriz.
> ### Db bağlantısı düzgün yapılmadıysa çalışmaz ve burda çalışan sql kodu ise `insert into city (Name,CountryCode,District,Population) values(?,?,?,?)` kodda görülen soru işaretleri girdiğiniz verilerdir aynı zamanda population verisini lütfen sayısal bir değer giriniz.

## 9- Eklediğiniz veriyi aratarak bulabilirsiniz. Eğer karşınız çıkmaz ise programı tekrar başlatın yüksek ihtimalle takrar çalıştırmanın ardından aradığınızda karşınıza çıkacaktır.

## 10- Zamanınızı ayırdığınız için teşekkürler. Yeni bir projede görüşmek üzere

----
# Tables

## Database Table

| Id(int)  | Name | CountryCode  | District | Population(int) |
| ------------- | ------------- | ------------- | ------------- | ------------- |
| 1  | Bilecik  | TUR  | TUR  | 72000  |
| 2  | Berlin  | GER  | SAX  | 13453823  |
> ### Databasemiz bu şekildedir

## Function Table

| Fonksiyon ismi | Açıklaması                   |
| ------------- | ------------------------------ |
| `ekle()`      | **DB'ye ekleme yapar**       |
| `ara()`   | **DB'den gelen veriler arasında tarama yapar**     |
> ### Kullandığımız Fonksiyonlar
----

# Nasıl işler(Görsel)

### `jsqlcon project > src > demo.java nın çalışması ile arayüz karşımıza geliyor.`

# Arayüz ile yapılabilecekler

> ## A-) **Arama**
-----------
> > ### A1-) Arama bölümüne gelip aramak istediğimiz ifadeyi giriyoruz (şehir, ülke, bölge vs.)
> > ![](jsqlcon%20project/wordlcity_pngs/1.png)

----

> > ### A2-) Görüldüğü üzere karekterleri girmeye başladığımız an arama yamaya başlar.
> > ![](jsqlcon%20project/wordlcity_pngs/2.png)

----

> > ### A3-) Burda da aramamızın son halini görüyruz.
> > ![](jsqlcon%20project/wordlcity_pngs/3.png)

----
> ## B-) **Ekleme**
> > ### B1-) Ekleme yapıcamız verileri tek tek giriyoruz sırası önemli değil
> > ![](jsqlcon%20project/wordlcity_pngs/4.png)

----

> > ### B2-) Verilerimiz girildikten sonra **ekle** butonuna basıyoruz ve verimiz ekleniyor
> > ![](jsqlcon%20project/wordlcity_pngs/5.png)
> > #### not: eğer db bağlantısında problem varsa veri eklenmeyecektir
----

> > ### B3-) Eklenen veriyi listenin scrollunu en aşşağı çekerek görebiliriz.
> > ![](jsqlcon%20project/wordlcity_pngs/6.png)
> > ### Bir sorun yaşarsanız bana mail adresimden ulaşabilirsiniz.

----
# Proje Çalışma Diyagramları

### Ekle diagramı

> ![](jsqlcon%20project/wordlcity_pngs/diagram.png)

----

### Ara diagramı
> ![](jsqlcon%20project/wordlcity_pngs/diagram2.png)

----
# **My links***

[Proje linki](https://github.com/NumaIYI/java-ile-db-baglantisi-arayuzu)

[Linkedin hesabım](https://tr.linkedin.com/in/ahmed-numan-%C3%A7ift%C3%A7i-96305a243 "Linkedin hesabım")

**Mail adresim : numanbey11@gmail.com**

[Instagram](https://www.instagram.com/ahmednuman.ciftci/)
