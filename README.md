# quotation-api

quotation_aoi is a Java Spring Boot service that simulates a validation os coverage quotation and work in line with other AI's to achieve it own purpose (using a Wiremock Cloud for while.(.

## Usage

Use the docker-compose to initialize a local MySQL instance with a database named 'quotation' and a local RabbitMQ server.

Making the REST requests POST, using the following body, you should receive a response like the example below.

- POST: http://localhost:8080/quotation/
- Body example
  ```
  {
    "product_id":"1b2da7cc-b367-4196-8a78-9cfeec21f587",
    "offer_id":"adc56d77-348c-4bf0-908f-22d402ee715c",
    "category":"HOME",
    "total_monthly_premium_amount":75.25,
    "total_coverage_amount":825000.00,
    "coverages":{
    "Incêndio":250000.00,
    "Desastres naturais":500000.00,
    "Responsabiliadade civil":75000.00
    },
    "assistances":[
        "Encanador",
        "Eletricista",
        "Chaveiro 24h"
    ],
    "customer":{
        "document_number":"36205578900",
        "name":"John Wick",
        "type":"NATURAL",
        "gender":"MALE",
        "date_of_birth":"1973-05-02",
        "email":"johnwick@gmail.com",
        "phone_number":11950503030
        }
    }
    ```

## Details

The code use Spring Data to persist the records in the database and use:

- Builder design pattern to make the code easier to read and expand.
