package com.secondhandbook.org.secondhandbook.controller.book;

import com.secondhandbook.org.secondhandbook.domain.ResponseObject;
import com.secondhandbook.org.secondhandbook.domain.book.BookDesc;
import com.secondhandbook.org.secondhandbook.factory.ResponseObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.secondhandbook.org.secondhandbook.service.book.BookDescServiceImpl;

@RestController
@RequestMapping("/secondhandbook/bookDesc")
public class BookDescController
{
    @Autowired
    BookDescServiceImpl bookDescService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createAuthor(@RequestBody BookDesc bookDesc)
    {
        System.out.println(bookDesc);
        ResponseObject responseObject = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(),"New Book and Description!");
        if(bookDesc.getAuthor()==null || bookDesc.getBookTitle()==null || bookDesc.getBookLanguage()==null ||
                bookDesc.getPublicationDate()==null || bookDesc.getIBNnumber()== null || bookDesc.getBookPrice()==null)
        {
            responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObject.setResponseDescription("Enter book description");
        }else
        {
            BookDesc savedbook = bookDesc;
            responseObject.setResponse(savedbook);

            if(bookDesc!= null)
            {
                bookDescService.create(bookDesc);
                bookDescService.update(savedbook);
                bookDescService.read(savedbook);
                bookDescService.delete(savedbook);
                bookDescService.getAll();
            }
            else {
                responseObject.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
                String message = bookDesc == null ? "author not found|" : "";
                responseObject.setResponseDescription(message);
            }
        }
        return ResponseEntity.ok(responseObject);
    }
}
