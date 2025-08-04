Collection of best practices for Java persistence performance in Spring Boot applications


docker run --name mysql-container -e MYSQL_ROOT_USERNAME=root -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql:8.0


Note: As a rule, in real applications avoid generating schema via hibernate.ddl-auto. Use schema-*.sql file or better Flyway or Liquibase migration tools.

Description: This application is an example of using schema-*.sql to generate a schema(database) in MySQL.

Key points:

in application.properties, set the JDBC URL (e.g., spring.datasource.url=jdbc:mysql://localhost:3306/bookstoredb?createDatabaseIfNotExist=true)
in application.properties, disable DDL auto (just don't add explicitly the hibernate.ddl-auto setting) or set it to validate
in application.properties, instruct Spring Boot to initialize the schema from schema-mysql.sql file
