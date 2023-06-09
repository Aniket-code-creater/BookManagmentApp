# BookManagmentApp
This is a Spring Boot application that provides a RESTful API for managing a list of books. 
## Technology used :
### Java, Springboot, Maven, SQL, Swagger UI

#### Swagger Image
<img src="https://i.ibb.co/SfMLFqM/swagger-image.png" alt="">

## API Endpoints
### Retrieve all books
##### Method: GET
##### URL: /ijona/books
Returns a list of all books.

### Retrieve a book by its ID
##### Method: GET
##### URL: /ijona/bookbyId/{Id}
Retrieves a book with the specified ID.

### Add a new book
 ##### Method: POST
##### URL: /ijona/addbook
Adds a new book to the list. The book details should be provided in the request body as JSON.

##### Example request body:

json
{
  "author": "string",
  "bookName": "string",
  "price": 0,
  "bookId": 0
}


### Update an existing book
##### Method: PUT
##### URL: /ijona/update
Updates an existing book with the specified ID. The updated book details should be provided in the request body as JSON.

###### Example request body:

{
  "author": "string",
  "bookName": "string",
  "price": 0,
  "bookId": 0
}



### Delete a book by its ID
##### Method: DELETE
##### URL: /ijona/delete/{Id}
Deletes a book with the specified ID.

##### Response Format
##### The API endpoints return JSON responses in the following format:

{
  "author": "string",
  "bookName": "string",
  "price": 0,
  "bookId": 0
}

###### In case of an error, the response format will be:


{
  "status": "error",
  "message": "Error message"
}


#### Contact
If you have any questions or suggestions, please contact me- aniketmakwana1010@gmail.com.





