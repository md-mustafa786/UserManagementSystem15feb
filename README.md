# userMangment
* This project store the data of user managment system 
## Framwork and Language use in this Project
* Springboot 
* java
## Dependencies
* Spring Web
* h2 Database
* hibernate
* lombok
* validation
## validation
* In validation on userName , email, dateOfBirth by(_), and phoneNo by first country code and then 10 digit no.
## Flow of project
* Create three layers model , service , controller, repository.
* In model layer create two classes first one is user class .
* In controller layer to performe CRUD operatiom by http request.
* In service layer write a business logic of CRUD operation.
* In repository layer exteds jpsRepositor.
## Constraints:
* user model will have-
* UserId
* username
* email
* dateofbirth
* date
* time
## Endpoints to provided :
* Adduser
* update user by userId
* delete user
* Get all user
* Get user by Id
