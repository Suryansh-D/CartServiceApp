## CartServiceApp

This is a SpringBoot Java Application which serves as a cart service using API calls through FakeStoreAPI.
This app. has various features like getting all carts , updating and deleting carts etc. which are fulfilled by calling repective APIs.

##Project Set-Up:

To setup the project you can follws these steps:
1. Intialize a new Spring Boot project from "https://start.spring.io/" .
2. Include necessary dependencies such as Spring Web, Spring Boot DevTools, and any other you find necessary.
3. Click on generate and the project will be downloaded.
4. Now extract and open that file in VScode(or any IDE) , mae sure you have neccesary exentions of SpringBoot.
5. And you can clone my code in it , and can work on it via your local machine.

##How to Run Project:

To run the project you can go through these steps:
1. You can go to any of your browser and type the url:"http://localhost:8080/carts/" .
2. Further you can use various feature like :
     1. Get All Carts by url : "http://localhost:8080/carts/"
     2. Get Cart by ID by :"http://localhost:8080/carts/{id}" , here ID could be any Long value e.g. 1 .
     3. Get Cart in date range : "http://localhost:8080/carts/date/{date}"
     4. Get User's cart : "http://localhost:8080/carts/user/{id}"
     5. Add new Product : "http://localhost:8080/carts"
     6. Update Product : "http://localhost:8080/carts/{id}"
     7. Delete Product : "http://localhost:8080/carts/{id}"


##How to Run Test:

To run the test , you can use PostMan , which is one of the most popular software testing tools which is used for API testing.

Follow these steps for testing on Postman :
1. Download postman destop client application from "https://www.postman.com/downloads/".
2. Then go to the workspace and you can see a testbar beside send button.
3. You paste the above urls to test the respective features:
   e.g.

   View All Cart test : "https://drive.google.com/file/d/1dwjFI8yaAiQko4hRB5hbk0hpFPblHjtD/view?usp=drive_link"

   View cart by ID test : "https://drive.google.com/file/d/1vnrm-f9aYNexAdASnJ9_1y6-nAZXr4HY/view?usp=drive_link" 
   
