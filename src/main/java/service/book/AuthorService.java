package service.book;

import domain.book.Author;
import service.IService;

import java.util.List;

public interface AuthorService extends IService<Author,String>
{
    List<Author> getAll();
}
