package com.secondhandbook.org.secondhandbook.controller.book;

import com.secondhandbook.org.secondhandbook.domain.book.Author;
import com.secondhandbook.org.secondhandbook.factory.book.AuthorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.secondhandbook.org.secondhandbook.service.book.AuthorServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    AuthorServiceImpl authorService;

    @PostMapping("/create/{name}/{bio}")
    public @ResponseBody
    Author create(@PathVariable String name, @PathVariable String bio){
        return authorService.create(AuthorFactory.getAuthor(name, bio));
    }
    @PutMapping("/update")
    public Author update(Author type){
        return authorService.update(type);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Author id){
        authorService.delete(id);
    }
    @GetMapping("/read/{id}")
    public @ResponseBody Author read(@PathVariable Author id){
        return authorService.read(id);
    }
    @GetMapping("/getAll")
    public @ResponseBody
    List<Author> getAll(){
        return authorService.getAll();
    }
}