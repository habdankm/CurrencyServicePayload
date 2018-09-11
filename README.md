This is very simple web service which emulates conversion of currency.

to start:
./gradlew bootRun
or
java -jar build/libs/CurrencyServicePayload-0.1.0.jar

to test:

curl -XGET 'http://localhost:9999/currency?price=123.45'
{"price":246.9,"payload":""}

curl --data-binary '@src/main/resources/request.json' -XPOST http://localhost:9999/currency_payload -H 'Content-type:application/json'
{"price":8.0,"payload":"kID5ldXEYQEXOXx2A4....DzecM4b99G"}
