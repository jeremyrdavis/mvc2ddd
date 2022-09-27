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

## Aggregate
Business logic belongs in the aggregate

## Repositories
All data access should be through the repository pattern

## Value Objects
Java Records make great value objects

## Services

## Hexagonal Architecture
quarkus ext add quarkus-smallrye-reactive-messaging-kafka

kcat -b localhost:55012 -t customers -P
{"firstName":"Lemmy","lastName":"Kilminster","email":"lemmy@motorhead.com"}

##

# mvc2ddd Project

git clone GITHUB_URL
quarkus dev


This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/mvc2ddd-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
