
### Event Listener
* Spring memiliki fitur Event Listener yang bisa kita gunakan untuk komunikasi antar class menggunakan Event
* Event di Spring merupakan object turunan dari ApplicationEvent, sedangkan Listener di Spring merupakan turunan dari ApplicationListener
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationEvent.html] 
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationListener.html] 
 
### Application Event Publisher
* Ketika kita ingin mengirimkan event ke listener, kita bisa menggunakan object 
ApplicationEventPublisher, dimana ApplicationEventPublisher juga merupakan super interface dari ApplicationContext
* Atau kita bisa menggunakan ApplicationEventPublisherAware untuk mendapatkan object ApplicationEventPublishe
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationEventPublisher.html]
* Kode : Event
 
* Kode : Listener
 
* Kode : Mengirim Event
 
* Kode : Mengakses Bean
 
 
 
### Event Listener Annotation
* Selain menggunakan interface ApplicationListener, kita juga bisa menggunakan Annotation untuk membuat Listener
* Ini lebih flexible dibanding menggunakan interface ApplicationListener
* Kita bisa menggunakan annotation @EventListener
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/event/EventListener.html]
* Kode : Event Listener Annotation
 
### Cara Kerja Event Listener Annotation?
* Annotation @EventListener bekerja dengan menggunakan Bean Post Processor bernama EventListenerMethodProcessor
* EventListenerMethodProcessor mendeteksi jika ada bean yang memiliki method dengan annotation @EventListener, maka secara otomatis akan membuat listener baru, lalu meregistrasikannya ke ApplicationContext.addApplicationListener(listener)
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/event/EventListenerMethodProcessor.html]
 

### Daftar Event
------------------------------------------------------------------------------------------------
|Event	                            | Keterangan                                                |
|-----------------------------------|-----------------------------------------------------------|
|ApplicationStartingEvent	        | Dikirim ketika start aplikasi                             |
|ApplicationContextInitializedEvent	| Dikirim ketika ApplicationContext sudah di initialisasi   |
|ApplicationStartedEvent	        | Dikirim ketika aplikasi sudah berjalan                    |
|ApplicationFailedEvent	            | Dikirim ketika aplikasi gagal berjalan                    |
|dan lain-lain	                    |                                                           |
