# BookManagmentApp
This is a Spring Boot application that provides a RESTful API for managing a list of books. 
## Technology used :
### Java, Springboot, Maven, SQL

## API Endpoints
### Retrieve all books
##### Method: GET
##### URL: /api/books
Returns a list of all books.

### Retrieve a book by its ID
##### Method: GET
##### URL: /api/books/{id}
Retrieves a book with the specified ID.

### Add a new book
 ##### Method: POST
##### URL: /api/books
Adds a new book to the list. The book details should be provided in the request body as JSON.

##### Example request body:

json
{
  "title": "The Great Gatsby",
  "author": "F. Scott Fitzgerald",
  "isbn": "9781234567890"
}


### Update an existing book
##### Method: PUT
##### URL: /api/books/{id}
Updates an existing book with the specified ID. The updated book details should be provided in the request body as JSON.

###### Example request body:

{
  "title": "New Title",
  "author": "New Author",
  "isbn": "9780987654321"
}



### Delete a book by its ID
##### Method: DELETE
##### URL: /api/books/{id}
Deletes a book with the specified ID.

##### Response Format
##### The API endpoints return JSON responses in the following format:

{
  "status": "success",
  "data": { ... }
}

###### In case of an error, the response format will be:


{
  "status": "error",
  "message": "Error message"
}


#### Contact
If you have any questions or suggestions, please contact your- aniketmakwana1010@gmail.com.





