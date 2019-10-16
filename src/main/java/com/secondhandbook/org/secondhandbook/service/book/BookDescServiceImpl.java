package com.secondhandbook.org.secondhandbook.service.book;

import com.secondhandbook.org.secondhandbook.domain.book.BookDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.secondhandbook.org.secondhandbook.repository.book.BookDescRepository;

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
    public BookDesc create(BookDesc bookDesc) {
        return this.bookDescRepository.save(bookDesc);
    }

    @Override
    public BookDesc update(BookDesc bookDesc) {
        return this.bookDescRepository.save(bookDesc);
    }

    @Override
    public void delete(BookDesc id) {
       this.bookDescRepository.delete(id);
    }

    @Override
    public BookDesc read(BookDesc id) {
        return this.bookDescRepository.save(id);
    }
    @Override
    public BookDesc retrieveByDesc(String author)
    {
        List<BookDesc> bookDescs = getAll();
        for(BookDesc bookDesc:bookDescs){
            if(bookDesc.getAuthor().equalsIgnoreCase(author))
                return bookDesc;
        }
        return null;
    }
}
