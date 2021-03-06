package lesson11_HW;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}

/* В задании нужно создать маленький кусочек системы для поиска и бронирования номеров в гостиницах.
 Архитектура: класс, описывающий комнаты, которые ищет система. Интерфейс API и три его реализации.
  Класс Controller который обрабатывает запросы на ресурс

Класс Room с полями
long id
int price
int persons
Date dateAvailableFrom
String hotelName
String cityName

Конструктор со всеми полями, все поля открыты на чтение, на изменение открыты поля price, dateAvailableFrom

Интерфейс API который содержит поведение:
Room[] findRooms(int price, int persons, String city, String hotel)
Room[] getAll()

Создайте три реализации API интерфейса с названиями: BookingComAPI, TripAdvisorAPI, GoogleAPI
Каждая реализация содержит поле Room[] rooms, которое должно инициализироваться в конструкторе.
 А так же реализацию методов интерфейса, со следующей логикой:

BookingComAPI находит комнаты по заданным параметрам, а так же комнаты, которые по цене отличаются на 100 единиц в обе стороны.
 Например если пользователь ищет комнату с ценой 50 и другими параметрами, BookingComAPI вернет все комнаты с ценой в диапазоне 0 - 150
TripAdvisorAPI находит комнаты по заданным параметрам, а так же, количество гостей ищется в диапазоне +-1.
 Например если пользователь ищет комнату с ко-вом гостей 3 и другими параметрами, TripAdvisorAPI вернет все комнаты с ко-вом гостей от 2 до четырех
GoogleAPI ищет сторого по заданным параметрам

Controller - класс, который содержит поле API[] apis,инициализируется в конструкторе, и два общедоступных метода

Room[] requestRooms(int price, int persons, String city, String hotel)
Который используя все реализации интерфейса API, находит комнаты по заданным параметрам

Room[] check(API api1, API api2)
Который находит общие комнаты у двух API (в результирующий массив добавлять комнаты с api1).
 Комнаты будем считать равными, если у них одинаковые все поля кроме id и dateAvailableFrom.
 Гарантируется что id комнаты уникальный во всей системе

В классе Demo в main методе протестируйте свое решение на тестовых данных, чтобы убедиться в его правильности.
 При этом, Demo класс не нужно сабмитить на сайт

Примечание:
В задании используется новый для вас термин - API (Application Programming Interface).
 Это понятие относится не только к джаве и не только к этому курсу, это тип приложения которое массово используется в
 построении современных ИТ систем и может быть написано на любом языке. Советую ознакомиться более детально что это с
 источников в интернете, так как знание подобных терминов весьма пригодится в дальнейшем обучении

P.S. Если есть вопросы по условию или есть проблемы с решением пишите ментору в чате */