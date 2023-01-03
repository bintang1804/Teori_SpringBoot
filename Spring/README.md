
 
### Spring Boot Application
* Sebelumnya kita selalu membuat Application Context secara manual, dan kita belum menggunakan fitur otomatis Spring Boot
* Hal ini sengaja saya jelaskan agar kita tidak kaget bagaimana semua itu bisa berjalan secara otomatis di Spring Boot
* Pada saat membuat aplikasi Spring Boot, kita akan mengganti @Configuration utama menjadi @SpringBootApplication
* Isi dari @SpringBootApplication itu sendiri sebenarnya gabungan dari @Configuration dan banyak hal lain, seperti contohnya @ComponentScan
* [https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html] 
 
* Kode : Foo Application
 
### Spring Application
* Selain @SpringBootApplication, untuk membuat Application Context nya, kita tidak perlu membuat manual, kita bisa gunakan class SpringApplication
* Secara otomatis SpringApplication akan membuat ApplicationContext dan melakukan hal-hal yang dibutuhkan secara otomatis
* [https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html] 
* Kode : Spring Application
 
### Spring Boot Test
* Untuk membuat unit test di Spring Boot, kita bisa menggunakan annotation 
@SpringBootTest(classes={YourConfiguration.class})
* Selanjutnya kita tidak perlu mengambil bean secara manual lagi menggunakan ApplicationContext, kita bisa menggunakan DI secara langsung di unit test nya menggunakan @Autowired
* [https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/test/context/SpringBootTest.html]
* Kode : Test Foo Application

 
### Customizing Spring Application
* Kadang ada kalanya kita ingin melakukan pengaturan di Spring Application sebelum Application Context nya dibuat
* [https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/SpringApplication.html]
* Kita bisa menggunakan langsung SpringApplication, atau bisa juga menggunakan SpringApplicationBuilder
* [https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/builder/SpringApplicationBuilder.html]
* Kode : Customizing Spring Application
 
 
### Spring Application Event
* Sebelumnya kita sudah belajar tentang Event Listener
* Di Spring Boot, terdapat banyak sekali Event yang dikirim ketika aplikasi Spring Boot berjalan
* Jika kita ingin, kita bisa membuat Listener untuk menerima event tersebut
* [https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/context/event/SpringApplicationEvent.html] 
 

 
### Spring Boot Plugin
* Saat kita membuat project Spring Boot, secara otomatis terdapat spring-boot-plugin di project maven kita
* Plugin ini bisa digunakan untuk mempermudah saat kita menjalankan aplikasi Spring kita *  Kita bisa gunakan perintah :

### mvn spring-boot:run
* Untuk menjalankan aplikasi Spring Boot kita, kita harus memastikan bahwa hanya ada satu main class

### Distribution File
* Spring Boot plugin juga sudah menyediakan cara membuat distribution file aplikasi kita
* Plugin ini akan mendeteksi main class di project kita, lalu membundle aplikasi kita beserta dependency yang dibutuhkan dalam satu file jar
* Pastikan hanya terdapat satu main class, karena jika lebih dari satu, maka spring boot plugin akan melakukan komplen
* Kita cukup gunakan perintah :

### mvn package
* Secara otomatis akan terbuat single jar application