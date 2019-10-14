package service.book;

import domain.book.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.book.AuthorRepository;

import java.util.List;
import java.util.Map;

@Service("BookByAuthorServiceImpl")
public class AuthorServiceImpl implements AuthorService
{
    private static AuthorServiceImpl service = null;
    private Map<String, Author> authorMap;

    public static AuthorServiceImpl getRepository()
    {
        if (service == null) service = new AuthorServiceImpl();
        return service;
    }

     @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> getAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author create(Author author) {
        this.authorMap.put(author.getName(),author);
        this.authorMap.put(author.getBio(),author);
        this.authorMap.put(author.getAuthorRegNum(),author);
        return author;
    }

    @Override
    public Author update(Author author) {
        this.authorMap.replace(author.getName(),author);
        this.authorMap.replace(author.getBio(),author);
        this.authorMap.replace(author.getAuthorRegNum(),author);
        return author;
    }

    @Override
    public void delete(Author id)
    {
        this.authorMap.remove(id);
    }

    @Override
    public Author read(Author id) {
        this.authorMap.get(id);
        return id;
    }
}
