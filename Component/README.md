
 
### Component Scan
* Import adalah hal yang sangat menarik, karena kita bisa memecah Configuration Class menjadi banyak Class
* Namun semakin lama, pasti aplikasi kita akan semakin besar, dan secara otomatis Configuration Class akan menjadi banyak
* Melakukan import satu persatu sudah tidak menyenangkan lagi jika terlalu banyak
* Spring memiliki fitur component scan, dimana kita bisa secara otomatis mengimport Configuration di sebuah package dan sub package nya secara otomatis
* Untuk melakukan itu, kita bisa gunakan annotation @ComponentScan
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/ComponentScan.html]
* Kode : Component Scan
 
 
### Component
* Sebelumnya kita sudah belajar membuat bean menggunakan method di configuration dengan annotation @Bean
* Spring juga menyediakan cara otomatis tanpa harus kita membuat method @Bean
* Kita bisa menandai sebuah class dengan annotation @Component, secara otomatis Spring akan membuatkan bean untuk class tersebut
* @Component hanya mendukung pembuatan satu bean, jadi jika kita ingin membuat beberapa bean dengan tipe yang sama, kita tetap harus menggunakan @Bean method
 
#### Component Bean Name
* Saat kita menggunakan @Component, nama bean akan secara otomatis dibuat otomatis oleh Spring 
* Jika kita menggunakan @ComponentScan, secara otomatis bean name secara otomatis akan menggunakan nama class namun menjadi camelCase, misal CategoryService menjadi categoryService, ProductWeb menjadi productWeb
* Jika kita menggunakan @Import, secara otomatis bean name akan menjadi NamaClass.class.getName()
* Namun jika ingin membuat nama berbeda, kita juga bisa gunakan @Component(value=”namaBean”)
Annotation
* Semua annotation yang sudah kita bahas di @Bean juga didukung di @Component
* Seperti misalnya @Scope, @PostConstruct, @PreDestroy, @Lazy, @Primary dan lain-lain
* Kode : Component
 
* Kode : Component Configuration
 
* Kode : Mengakses Component