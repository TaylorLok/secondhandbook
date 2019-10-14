package service.book;

import domain.book.BookDesc;
import service.IService;

import java.util.List;

public interface BookDescService extends IService<BookDesc,String>
{
    List<BookDesc> getAll();
}
