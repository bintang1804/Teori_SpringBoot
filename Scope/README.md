
 
### Scope
* Scope merupakan strategy cara sebuah object dibuat
* Secara default strategy object di Spring adalah singleton, artinya hanya dibuat sekali, dan ketika kita akses, akan mengembalikan object yang sama
* Namun kita juga bisa mengubah scope bean yang kita mau di Spring
* Untuk mengubah scope sebuah bean, kita bisa tambahkan annotation @Scope(value=”namaScope”)
 
 
### Bean Scope
---------------------------------------------------------------------
|Scope   	| Keterangan                                            |
|-----------|-------------------------------------------------------|
|singleton	| (Default) Hanya dibuat sekali dalam Spring IoC        |
|prototype	| Selalu dibuat object baru setiap kali bean diakses    |
|request    | Dibuat baru per HTTP Request (hanya untuk Web App)    |
|session    | Dibuat baru per HTTP Session (hanya untuk Web App)    |
|application| Dibuat baru per ServletContext (hanya untuk Web App)  |
|websocket  | Dibuat baru per WebSocket (hanya untuk WebSocket App) |


* Kode : Scope Prototype
 
 
* Kode : Mengakses Bean
 
 
 
### Membuat Scope
* Jika scope yang disediakan oleh Spring tidak bisa memenuhi kebutuhan kita, kita juga bisa membuat scope sendiri
* Caranya dengan membuat class yang implement interface Scope
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/Scope.html] 
* Selanjutnya untuk meregistrasikannya, kita bisa membuat bean CustomScopeConfigurer
* [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/CustomScopeConfigurer.html] 
* Kode : Doubleton Scope
 
* Kode : Register Doubleton Scope
 
* Kode : Mengakses Doubleton Bean
 