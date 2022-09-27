## code.quarkus.io

RESTEasy Classic Jackson
Hibernate ORM with Panache
JDBC Driver - PostgreSQL

## IDE
git clone GITHUB_REPO

change the <maven.compiler.release>11</maven.compiler.release> to <maven.compiler.release>17</maven.compiler.release> on line 10 of the pom.xml

quarkus dev

## MVC

### Model

Customer

## View

Postman/JSON

## Controller

CustomerResource

## Business Logic

CustomerLoyaltyStatus

## Aggregate
Business logic belongs in the aggregate

## Repositories
All data access should be through the repository pattern

## Value Objects
Java Records make great value objects

## Services

Services orchestrate/coordinate things

## Hexagonal Architecture
quarkus ext add quarkus-smallrye-reactive-messaging-kafka

kcat -b localhost:55012 -t customers -P
{"firstName":"Lemmy","lastName":"Kilminster","email":"lemmy@motorhead.com"}

