package service.book;

import domain.book.BookDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.book.BookDescRepository;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

@Service("BookServiceImpl")
public class BookDescServiceImpl implements BookDescService
{
    private static BookDescServiceImpl service = null;
    private Map<String, Book> book;

    public static BookDescServiceImpl getRepository()
    {
        if(service == null) service = new BookDescServiceImpl();
        return service;
    }

    @Autowired
    BookDescRepository bookDescRepository;

    @Override
    public List<BookDesc> getAll() {
        return this.bookDescRepository.findAll();
    }

    @Override
    public BookDesc create(BookDesc type) {
        return null;
    }

    @Override
    public BookDesc update(BookDesc type) {
        return null;
    }

    @Override
    public void delete(BookDesc id) {

    }

    @Override
    public BookDesc read(BookDesc id) {
        return null;
    }
}
