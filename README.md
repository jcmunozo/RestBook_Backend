# RestBook_Backend

A basic API REST FULL created using java spring-boot, this API allows you to manipulate  Books, Users and Loans.

---

## Technologies

- [Java](https://docs.oracle.com/en/java/javase/22/)
- [Spring-Boot](https://spring.io/projects/spring-boot)
- [Maven](https://mvnrepository.com/)
- [Postgres](https://www.postgresql.org/)

---

## How to start

- You need to have java 17, openjdk and maven installed on your system
- You need to create a postgres database, make sure you have create permissions; otherwise grant permissions to your user
- Create a file called .env and add this url and your database variables:  
```
DATABASE_URL=jdbc:postgresql://localhost:5432/your_database_name  
DATABASE_USERNAME=your_database_user  
DATABASE_PASSWORD=your_database_password
```
- run project with  
```
mvn spring-boot:run
```

Then you can check yout localhost:8080 and start using this API Rest.

---

## Swagger documentation
![Screenshot from 2024-08-17 12-45-10](https://github.com/user-attachments/assets/6edaa621-775f-4609-953c-6158e20ca333)

