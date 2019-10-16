package com.secondhandbook.org.secondhandbook.repository.book;

import com.secondhandbook.org.secondhandbook.domain.book.BookDesc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDescRepository extends JpaRepository<BookDesc,String> {
}
