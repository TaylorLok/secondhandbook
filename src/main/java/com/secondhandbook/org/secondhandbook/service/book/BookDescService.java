package com.secondhandbook.org.secondhandbook.service.book;

import com.secondhandbook.org.secondhandbook.domain.book.BookDesc;
import com.secondhandbook.org.secondhandbook.service.IService;

import java.util.List;

public interface BookDescService extends IService<BookDesc,String>
{
    List<BookDesc> getAll();

    BookDesc retrieveByDesc(String author);
}
