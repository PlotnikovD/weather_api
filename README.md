Проект написан с использованием: Java 8, Spring Boot, liquibase, PostgreSQL.

  Реализован REST сервис хранения и предоставления информации о температуре в городах. Запрос на сервер происходит с переодичностью в 30 минут. 
Данные,полученные от сервиса сохраняются в базу данных

Бизнес требования:

- перечень городов на английском языке задается в конфиг файле.
- температура для городов из заданного списка запрашивается из публично доступного REST сервисоа погоды - https://openweathermap.org/
- значения, полученные от сервиса для городов в текущий момент, складываются в БД с текущим timestamp;
- периодичность опроса сервисов задается в настройках приложения;
- сервис предоставляет REST-ендпоинт, через который, указав город, можно получить последнее записанное в БД значение температуры 
и время его записи для данного города

 GET "/{city}" - последние записанные в БД данные о погоде в заданном городе.
 
 GET "/weathers" - получение всех данных о погоде записанных в БД.
