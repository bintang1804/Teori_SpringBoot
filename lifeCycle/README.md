
### Life Cycle
* Spring Container memiliki alur hidup, dan jika kita ingin berinteraksi dengan alur hidup nya Spring, kita juga bisa lakukan
* Saat pertama kali Spring berjalan dan sudah selesai membuat bean, Spring akan memberitahu bean tersebut bahwa bean tersebut sudah siap, artinya semua dependencies sudah dimasukkan.
* Dan ketika aplikasi Spring akan mati, Spring juga akan memberitahu semua bean bahwa bean tersebut akan dihancurkan
Life Cycle Callback
* Secara default, bean tidak bisa tahu alur hidup Spring ketika selesai membuat bean dan ketika akan menghancurkan bean
* Jika kita tertarik untuk bereaksi ketika alur hidup Spring terjadi, maka kita bisa implements interface InitializingBean dan DisposableBean
* InitializingBean digunakan jika kita ingin bereaksi ketika Spring selesai membuat bean
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html]
* DisposableBean digunakan jika kita ingin bereaksi ketika Spring akan menghancurkan bean
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/DisposableBean.html] 
* Kode : Connection Class
 
* Kode : LifeCycle Configuration
 
* Kode : Mengakses Connection
 
 
 
### Life Cycle Annotation
* Selain menggunakan interface InitializingBean dan DisposableBean, kita juga bisa menggunakan annotation untuk mendaftarkan callback method untuk lifecycle
* Pada annotation @Bean, terdapat method initMethod() dan destoyMethod()
* initMethod() digunakan untuk meregistrasikan method yang akan dipanggil ketika bean selesai dibuat
* destroyMethod() digunakan untuk meregistrasikan method yang akan dipanggil ketika bean akan dihancurkan
* Methodnya harus tanpa parameter, dan return value nya tidak akan dipedulikan, jadi sebaiknya gunakan void saja
* Kode : Server Class
 
* Kode : Server Configuration
 
* Kode : Mengakses Server
 
@PostConstruct dan @PreDestroy
* Selain menggunakan annotation @Bean, untuk menandai sebuah method adalah init method dan destroy method, kita juga bisa menggunakan annotation pada method nya secara langsung
* Ini bisa digunakan untuk menghindari kita lupa menyebutkan init dan destroy method ketika membuat @Bean
* @PostConstruct merupakan method yang ditandai harus dipanggil ketika bean selesai dibuat
* @PreDestroy merupakan method yang ditandai harus dipanggil ketika bean akan dihancurkan
* Jika sudah menggunakan annotation ini, kita tidak perlu lagi menyebutkan nya di @Bean
* Kode : Server Class
 
 