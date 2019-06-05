# Spring boot REST error handling with @ControllerAdvice

### Error handling with @ControllerAdvice
* Spring 3.2
* global @ExceptionHandler with the @ControllerAdvice annotation. This enables a mechanism that breaks away from the older MVC model and makes use of ResponseEntity
* Full control over the body of the response as well as the status code
* Mapping of several exceptions to the same method, to be handled together
* It makes good use of the newer RESTful ResposeEntity response

### In this sample project:
NotFoundAdvice class annotated with @ControllerAdvice is a global exception handler for all controllers.

Exception classes handler by the advice are listed with @ExceptionHandler

Project contains single entity, repository, service and controller classes. H2 database initialized with sample records.

Run with command: `mvn spring-boot:run`

REST url to find an entity: http://localhost:8080/api/cow/1

Url for Not Found error: http://localhost:8080/api/cow/4
