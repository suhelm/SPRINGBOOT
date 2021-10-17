Initial Code to work with.
This is a basic CRUD application with no much technical details

1. @RestController is the entry point for any request made to the application.
2. Coffee is the domain of the application
3. ApplicationSecurity is a class which to bypass spring security for testing purpose:


GET : http://localhost:8080/coffees
POST : http://localhost:8080/coffees

{
    "name": "Desi Chai",
    "price": 0.0,
    "id": 0
}

Learning points in this project:
1. What is @RestController
2. @RequestMapping
3. @GetMapping
4. @PutMapping
5. @DeleteMapping
6. @PostMapping
7. @PathVariable



