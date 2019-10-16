package com.secondhandbook.org.secondhandbook.service.book;

import com.secondhandbook.org.secondhandbook.domain.book.Author;
import com.secondhandbook.org.secondhandbook.service.IService;

import java.util.List;

public interface AuthorService extends IService<Author,String>
{
    List<Author> getAll();
}
