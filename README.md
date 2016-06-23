# Очередной язык программирования

Особенности
-----------
* Java-подобный синтаксис
* Будет транслироваться существующий язык (Java или C++)
* Заточен на удобство программиста без потери производительности

Предполагаемые возможности
--------------------------
* Статическая типизация в стиле Java
* Поддержка generics и templates
  * Полная поддержка generics с наследованием типов и ко/контрвариантностью типов
  * Compile-time разворачивание templates 
  * Параметры типов будут помечаться: generic или template параметр
    * <b>class</b> A\<K, <b>template</b> V\> ...
* Функциональный стиль: поддержка стрелочных типов вида A → B
