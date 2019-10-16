package controller.book;

import domain.ResponseObject;
import domain.book.Author;
import factory.ResponseObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.book.AuthorServiceImpl;

@RestController
@RequestMapping("/secondhandbook/author")
public class AuthorController
{
   @Autowired
    AuthorServiceImpl authorService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createAuthor(@RequestBody Author author)
    {
        System.out.println(author);
        ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(),"New Author!");
        if(author.getName()==null || author.getBio()==null || author.getAuthorRegNum()==null)
        {
            responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObject.setResponseDescription("Enter Author Credentials");
        }else
        {
            Author savedAuthor = author;
            responseObject.setResponse(savedAuthor);

            if(author!= null)
            {
                authorService.create(author);
                authorService.update(savedAuthor);
                authorService.read(savedAuthor);
                authorService.delete(savedAuthor);
                authorService.getAll();
            }
            else {
                responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
                String message = author == null ? "author not found|" : "";
                responseObject.setResponseDescription(message);
            }
        }
        return ResponseEntity.ok(responseObject);
    }
}
